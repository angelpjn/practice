import java.util.Vector;

public class VectorEx {
	public static void main(String[ ] args) {
		Vector<Integer> v = new Vector<Integer>( ); // Integer�� ����

		System.out.println("vector ���� ��� ��ü ��) : " + v.size( ));
		System.out.println("vector�� �⺻ �뷮 : " + v.capacity( ));

		v.addElement(33); // ���� 33 ����
		v.addElement(7788);
		v.addElement(12);

		System.out.println("vector ���� ��� ��ü ��) : " + v.size( ));
		System.out.println("vector�� �뷮 : " + v.capacity( ));

		// ��� ��� ���
		for (int i = 0; i < v.size( ); i++) {
			System.out.println(v.get(i));
		}

		System.out.println("vector�� ù��° ��� : " + v.elementAt(0));
	}
}