class Fruit {  // ����(�θ�, ����) Ŭ����
	protected String name; // ���� Ŭ�������� ���� ���

	public void fruiter( ) {
		System.out.println("���� ����");
	}
}

class Apple extends Fruit {  // ����(�ڽ�, ����) Ŭ����
	private String flavor;

	public String getFlavor( ) {
		return flavor;
	}

	void setFlavor(String flavor) {
		this.flavor = flavor;
	}
}

public class InheritanceDemo {
	public static void main(String[ ] args) {
		Fruit f = new Fruit( );  // ���� Ŭ���� ��ü
		f.fruiter( ); // ���� Ŭ������ �ִ� �޼��� ȣ��

		Apple a = new Apple( ); // ���� Ŭ���� ��ü
		a.setFlavor("sweet"); // ���� Ŭ������ �ִ� �޼��� ȣ��
		System.out.println("��� ��: " + a.getFlavor( ));
	}
}