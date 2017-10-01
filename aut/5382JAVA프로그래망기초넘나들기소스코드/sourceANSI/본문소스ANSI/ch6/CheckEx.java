class Fruit { }
class Apple extends Fruit { }

public class CheckEx {
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