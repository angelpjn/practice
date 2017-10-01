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
	}
	public boolean isVegetable( ) { // �������̽��� �޼��� ����
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