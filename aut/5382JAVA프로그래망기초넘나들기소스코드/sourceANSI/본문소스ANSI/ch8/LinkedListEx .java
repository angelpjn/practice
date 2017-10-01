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
		dll.addLast("Z"); // �ǳ��� ����
		dll.addFirst("A"); // ù ��ġ�� �߰��ϰ� ���ʷ� ���� ��ġ�� �̵�
		dll.add(1, "T");

		dll.add(0, "beer");
		System.out.println("#2 �߰��� DLL ��� ���: " + dll);

		Iterator<String> itr = dll.iterator( );
		while (itr.hasNext( )) {
			System.out.print(itr.next( ) + " ");
		}
		System.out.println("#3 DLL ���: " + dll);

		dll.remove(2); // �ε��� 2 ��� �����ϰ� �ϳ��� ������ �̵�
		dll.removeFirst( ); // ���ؽ� 0 ��� �����ϰ� �ϳ��� ������ �̵�
		dll.removeLast( ); // �� ��� ����

		System.out.println("#4 DLL ���: " + dll);

		for (int a = 0; a < dll.size( ); a++) {
			System.out.print(dll.get(a) + " ");
		}
		System.out.println( );

		List<String> subList = dll.subList(3, dll.size( ));
		System.out.println("#4 index 3 ���� " + dll.size( ) + ": " + subList);

		Collections.sort(dll); // ����
		System.out.println("#5 DLL ��� ����: " + dll);

		Collections.reverse(dll); // ���� ����
		System.out.println("#6 DLL ��� ���� ����: " + dll);

		Object[ ] ar = dll.toArray( ); // LinkedList�� Array�� ��ȯ
		for (int i = 0; i < ar.length; i++) {
			System.out.print("Ar[" + i + "]= " + ar[i] + ", ");
		}
		System.out.println( );

		dll.clear( ); // ��� ��� ����
		System.out.println("��� ��� ����  : " + dll);
	}
}