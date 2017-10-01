import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[ ] args) {
		/* clone 메서드를 사용한 배열 복사 */
		int[ ] a = { 7, 3, 5, 2, 9 };
		int[ ] b = a.clone( ); // 배열 모든 요소 복사
		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "] = " + b[i] + ", ");
		}
		System.out.print("\n arraycopy( ) 메서드를 사용한 배열 복사: ");

		/* arraycopy( ) 메서드를 사용한 배열 복사 */
		int[ ] c = new int[a.length];
		System.arraycopy(a, 0, c, 0, a.length);
		for (int i = 0; i < c.length; i++) {
			System.out.print("  " + c[i]);
		}
		System.out.print("\n arraycopy( ) 메서드를 사용한 특정 부분 복사: ");
		// 특정 부분 복사, a[3] ~ a[5]의 값(2개)을 c[3] ~ c[5]에 복사
		System.arraycopy(a, 0, c, 3, 2);
		for (int e : c)
			System.out.print("  " + e);
		System.out.print("\n 반복문을 이용한 배열 복사: ");

		/* 반복문을 이용한 배열 복사 */
		int[ ] d = new int[a.length];
		for (int i = 0; i < d.length; i++) {
			d[i] = a[i];
			System.out.print("  " + d[i]);
		}
		System.out.print("\n copyOf( ) 을 이용한 배열 복사: ");

		/* java.util.Arrays 클래스에서 제공하는 copyOf( ) 을 이용한 배열 복사 */
		int[ ] g = new int[a.length];
		g = Arrays.copyOf(a, a.length);
		for (int e : g)
			System.out.print("  " + e);
		System.out.println( );
	}
}