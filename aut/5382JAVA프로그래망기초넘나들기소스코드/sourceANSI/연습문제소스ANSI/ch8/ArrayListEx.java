import java.util.*;

public class ArrayListEx {
	static Integer sum(Number[ ] numbers) {
		Integer sum = 0;
		for (Number e : numbers) {
			sum += e.intValue( );
		}
		return sum;
	}

	public static void printList(List<Integer> list) {
		for (Integer e : list) {
			System.out.print(e + " ");
		}
		System.out.println( );
	}

	public static void printData(List<Integer> list) {
		for (int i = 0; i < list.size( ); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println( );
	}

	static ArrayList<Integer> aList2 = new ArrayList<>( );

	static void addMore( ) {
		aList2.add(7788);
	}

	public static void main(String[ ] args) {
		ArrayList<Integer> list = new ArrayList<Integer>( );

		list.add(3); list.add(7); list.add(9);
		list.add(2, 88); // 위치 1에 88 추가하고 차례로 다음으로 이동
		printData(list); // 호출

		Integer[ ] ar = { }; // 비어 있는 배열
		ar = list.toArray(ar); // 전달, 배열 array처럼 사용
		for (int e : ar) {
			System.out.print(e + " ");
		}
		System.out.println( );

		list.remove(2);
		printData(list); // 호출

		// Search for values.
		int i1 = list.indexOf(9); // 처음 검색한 위치(index)
		int i2 = list.lastIndexOf(7); // 마지막 검색 위치
		int i3 = list.indexOf(77); // 없으면 -1 값을 리턴

		System.out.println(i1); // 2 이므로 3번째 위치
		System.out.println(i2); // 1 이므로 2번째 위치
		System.out.println(i3); // -1 이므로 찾지 못함

		list.set(0, 5555); // 위치 0의 값을 5555로 수정
		printList(list); // 호출
		list.clear( ); // 리스트의 모든 요소 삭제
		if (list.isEmpty( )) {
			System.out.println("리스트가 비어 있음");
		}

		aList2.add(22); // static ArrayList
		aList2.add(33);
		addMore( );
		System.out.println(aList2);
		System.out.println(aList2.size( ));
	}
}