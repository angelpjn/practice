class Fruit { }
class Apple extends Fruit { }

public class class Human { // ���� Ŭ����, �θ� Ŭ����, ���� Ŭ����
	public void move( ) {
		System.out.println("�ΰ��� �����δ�.");
	}
}

class Boy extends Human { // ���� Ŭ����, �ڽ� Ŭ����, ���� Ŭ����
	public void move( ) {
		super.move( ); // ���� Ŭ���� Human�� move( ) ȣ��
		System.out.println("�ҳ��� �����δ�.");
	}
}

public class OverridingEx {
	public static void main(String args[ ]) {
		Human a = new Human( ); // Human ��ü ����
		Human b = new Boy( ); // Boy Ŭ���� ��ü�� Human ��ü ����
		Boy c = new Boy( ); // Boy ��ü ����

		a.move( ); // Human Ŭ������ move( ) ȣ���Ͽ� ����
		b.move( ); // Boy Ŭ������ move( ) ȣ���Ͽ� ����
		c.move( ); // Boy Ŭ������ move( ) ȣ���Ͽ� ����
	}
} {
	public static void main(String[ ] args) {
		Fruit f = new Fruit( );
		Apple a = new Apple( );

		f = (Fruit) a; // upcasting, (Fruit)�� �����ص� ���������� �̷���
		a = (Apple) f; // downcasting

		boolean x = f instanceof Fruit; // ���: true, 
		boolean y = f instanceof Apple; // ���: true
		boolean t = f.getClass( ).equals(Fruit.class); // False, ��ӹ��� �ʱ� ����
		boolean z = f.getClass( ).equals(Apple.class); // True
		System.out.println("x = " + x + " , y = " + y);
		System.out.println("t = " + t + " , z = " + z);

		if (f instanceof Fruit) { // Ÿ�� Ȯ��
			System.out.println("Fruit Ÿ��");
		} else if (f instanceof Apple) {
			System.out.println("Apple Ÿ��");
		}

		Apple c = (f instanceof Apple) ? (Apple) f : null;
	}
}