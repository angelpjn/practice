import java.util.*;

public class VectorEx {
	public static void main(String[ ] args) {
		Vector v[ ] = new Vector[3]; // Vector Ŭ�����迭 ����

		v[0] = new Vector( ); // ��ü����
		v[1] = new Vector(5); // ���� ���� capacity( )���� 5
		v[2] = new Vector(5, 2); // ���� ���� 5, ���ο� ��ü�� �߰��� 2�� �þ

		for (int i = 0; i < v.length; i++) {
			System.out.println("���� V�� ������� ���� = " + v[i].capacity( ));
		}

		System.out.println( );

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				v[i].addElement(1234);
			}
		}

		for (int i = 0; i < v.length; i++) {
			System.out.print("V[" + i + "]�� ��ü �� = " + v[i].size( ));
			System.out.println(", ���� ���� ���� = " + v[i].capacity( ));
		}

		Vector vc = new Vector( );
		vc.add(33);  vc.add(55); vc.add(88);
		vc.add(1, 99); // ��ġ 1�� 99 �����ϰ� �� ĭ�� �ڷ� �̵���
		System.out.println("���� vc�� ��� ���� = " + vc.size( ));
		System.out.print("v[0] = " + vc.elementAt(0) + ", ");
		System.out.print("v[1] = " + vc.elementAt(1) + ", ");
		System.out.print("v[2] = " + vc.elementAt(2) + ", ");
		System.out.println("v[3] = " + vc.elementAt(3));

		vc.remove(0); // ��ġ 0�� ���� ���ְ� �� ĭ�� ���� �̵���
		vc.remove(1); // ��ġ 1�� ���� ���ְ� �� ĭ�� ���� �̵���

		for (int i = 0; i < vc.size( ); i++) {
			Integer result = (Integer) vc.elementAt(i);
			System.out.println("���� ��� : " + result);
		}
	}
}