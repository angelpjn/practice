interface Fruit {
	public boolean hasPeel( ); // �ݵ�� ���� Ŭ�������� �����ؾ� ��
}

interface Vegetable {
	public boolean isVegetable( ); // �ݵ�� ���� Ŭ�������� �����ؾ� ��
}

public class Tomato implements Fruit, Vegetable {  // implements�� ����
	boolean peel = false;
	boolean vegetable = false;

	public Tomato( ) {  } // �⺻ ������, �� �������� ����	
	public boolean hasPeel( ) { // �������̽��� �޼��� ����
		return peel;
	}interface Ia {
	public static final int c = 88; // public static final ���� ����

	// �ʵ�� ����Ʈ�� public abstract final ��� ����
	public abstract void method( ); // �޼��� ����Ʈ�� public abstract
}

interface Ib { // �߻� �޼���� ��� ��ӹ޴� ������ �����ؾ� ��
	void method( ); // public abstract�� �⺻�̹Ƿ� ���� ����
}

// �������̽� ���� ����� extends�� ����Ͽ� �������̽��� ,�� ����
interface Ic extends Ia, Ib { // Ic�� Ia, Ib ��ӹ���
	public void method2( );
}

class B {
	public String method4( ) {
		String strB = "B�� method4";
		return strB;
	}

	public String toString( ) { return "B���� �������̵��� �޼��� ����"; }
}

class C extends B implements Ic {
	public void method( ) { }; // Ib�� ��� �߻� �޼��带 �����ؾ� ��
   // Ic�� ��� �߻� �޼��带 �����ؾ� ��
	public void method2( ) { System.out.println("C�� method2 ����");
	}
	public void method3( ) { };
	public void method5( ) { System.out.println("C�� method5 ����"); }
}

// �������̽� ������ implements �� ����Ͽ� �߻� �޼��� ����
class A implements Ic {
	// �������̽��� ��ӹ��� Ŭ���������� ��ӹ���
	// �������̽��� ��� �޼��带 �����ؾ���
	public void method( ) { // Ib�� ��� �߻� �޼��带 �����ؾ� ��
		System.out.println("I can do it!");
	}

	public void method2( ) { }; // Ic�� ��� �߻� �޼��带 �����ؾ� ��
	public void method3( ) { }; // �⺻�� public static �̹Ƿ� ����
}

public class InterfaceEx3 {
	public static void main(String[ ] args) {
		A obj = new A( );
		Ia ia = new C( );
	}
}
		return vegetable;
	}
	public static void main(String[ ] args) {
		Tomato tomato = new Tomato( );
		if (tomato.hasPeel( ))
			System.out.println("������ �����.");
		else
			System.out.println("������ �� �����.");
	}
}