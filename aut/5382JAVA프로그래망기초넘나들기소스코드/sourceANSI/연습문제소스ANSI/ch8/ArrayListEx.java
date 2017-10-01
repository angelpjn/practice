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
		list.add(2, 88); // ��ġ 1�� 88 �߰��ϰ� ���ʷ� �������� �̵�
		printData(list); // ȣ��

		Integer[ ] ar = { }; // ��� �ִ� �迭
		ar = list.toArray(ar); // ����, �迭 arrayó�� ���
		for (int e : ar) {
			System.out.print(e + " ");
		}
		System.out.println( );

		list.remove(2);
		printData(list); // ȣ��

		// Search for values.
		int i1 = list.indexOf(9); // ó�� �˻��� ��ġ(index)
		int i2 = list.lastIndexOf(7); // ������ �˻� ��ġ
		int i3 = list.indexOf(77); // ������ -1 ���� ����

		System.out.println(i1); // 2 �̹Ƿ� 3��° ��ġ
		System.out.println(i2); // 1 �̹Ƿ� 2��° ��ġ
		System.out.println(i3); // -1 �̹Ƿ� ã�� ����

		list.set(0, 5555); // ��ġ 0�� ���� 5555�� ����
		printList(list); // ȣ��
		list.clear( ); // ����Ʈ�� ��� ��� ����
		if (list.isEmpty( )) {
			System.out.println("����Ʈ�� ��� ����");
		}

		aList2.add(22); // static ArrayList
		aList2.add(33);
		addMore( );
		System.out.println(aList2);
		System.out.println(aList2.size( ));
	}
}