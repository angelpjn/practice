import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[ ] args) {
		LinkedList<String> dll = new LinkedList<String>( );
		dll.add("c");
		dll.add("a");
		dll.add("n");
		dll.addLast("Z"); // 맨끝에 삽입
		dll.addFirst("A"); // 첫 위치에 추가하고 차례로 다음 위치로 이동
		dll.add(1, "T");

		dll.add(0, "beer");
		System.out.println("#2 추가된 DLL 모든 요소: " + dll);

		Iterator<String> itr = dll.iterator( );
		while (itr.hasNext( )) {
			System.out.print(itr.next( ) + " ");
		}
		System.out.println("#3 DLL 요소: " + dll);

		dll.remove(2); // 인덱스 2 요소 삭제하고 하나씩 앞으로 이동
		dll.removeFirst( ); // 인텍스 0 요소 삭제하고 하나씩 앞으로 이동
		dll.removeLast( ); // 끝 요소 삭제

		System.out.println("#4 DLL 요소: " + dll);

		for (int a = 0; a < dll.size( ); a++) {
			System.out.print(dll.get(a) + " ");
		}
		System.out.println( );

		List<String> subList = dll.subList(3, dll.size( ));
		System.out.println("#4 index 3 부터 " + dll.size( ) + ": " + subList);

		Collections.sort(dll); // 정렬
		System.out.println("#5 DLL 요소 정렬: " + dll);

		Collections.reverse(dll); // 역순 정렬
		System.out.println("#6 DLL 요소 역순 정렬: " + dll);

		Object[ ] ar = dll.toArray( ); // LinkedList를 Array로 변환
		for (int i = 0; i < ar.length; i++) {
			System.out.print("Ar[" + i + "]= " + ar[i] + ", ");
		}
		System.out.println( );

		dll.clear( ); // 모든 요소 제거
		System.out.println("모든 요소 제거  : " + dll);
	}
}