import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {
	public static void main(String args[ ]) {
		ArrayList<String> arrayList = new ArrayList<String>( );

		arrayList.add("Java"); // 리스트에 문자열 "Ajeet" 추가
		arrayList.add("Oracle");
		arrayList.add("sun");

		System.out.println("#1 리스트 요소:" + arrayList); // 모든 요소 출력

		arrayList.add(0, "DB"); // 첫 번째 위치에 "Rahul" 추가
		arrayList.add(1, "C++"); // 2번째 위치에 추가
		System.out.println("#2 리스트 요소:" + arrayList); // 모든 요소 출력

		Collections.sort(arrayList); // 정렬

		System.out.println("#3 정렬 후 리스트 요소: ");
		for (int i = 0; i < arrayList.size( ); i++)
			System.out.println(arrayList.get(i)); // i 번째 요소 읽어오기
	}
}