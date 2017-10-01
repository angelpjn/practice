import java.util.Arrays;
import java.util.Collections;

public class SortArray {
	public static void main(String[ ] args) {

		int[ ] ar = { 8, 3, 5, 9, 4, 1, 7, 2 };
		int[ ] revAr = new int[ar.length];
		Arrays.sort(ar); // 올림차순으로 정렬
		System.out.println("원본: " + Arrays.toString(ar)); // 정수-> 문자열

		for (int i = ar.length - 1; i >= 0; i--)
			System.out.print(ar[i] + ", ");
		System.out.println("역순으로 : " + Arrays.toString(ar));

		System.out.print("오림차순으로 출력: ");
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");
		System.out.println( );

		String[ ] name = { "Java", "C", "Oracle", "Eclpse" };
		Arrays.sort(name, Collections.reverseOrder( )); // 내림차순으로 정렬
		System.out.println("name 정렬: " + Arrays.toString(name));

		Integer[ ] obj = toReferenc(ar); // 변환 메서드 호출
		System.out.print("[int -> Integer] : ");
		System.out.println(Arrays.toString(obj)); // 정수를 문자열로 변환

		Integer[ ] obj2 = new Integer[ ] { 88, 77, 33 };
		int[ ] newObj2 = toPrimitive(obj2); // 변환 메서드 호출
		System.out.println("[Integer -> int] : ");
		for (int temp : newObj2) {
			System.out.println("\t\t" + temp);
		}
	}

	// int 타입을 Integer 타입으로 변환하는 toReferenc( ) 메서드
	public static Integer[ ] toReferenc(int[ ] ar) {
		Integer[ ] result = new Integer[ar.length];
		for (int i = 0; i < ar.length; i++) {
			result[i] = Integer.valueOf(ar[i]);
		}
		return result;
	}

	// Integer 타입을 int 타입으로 변환하는 toReferenc( ) 메서드
	public static int[ ] toPrimitive(Integer[ ] ar) {
		int[ ] result = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			result[i] = ar[i].intValue( );
		}
		return result;
	}
}