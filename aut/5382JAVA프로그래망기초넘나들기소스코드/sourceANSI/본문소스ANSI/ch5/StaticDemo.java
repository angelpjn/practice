class MyClass {
	private static int iv = 0; // ��� ��ü���� ����

	void increment( ) {
		MyClass.iv = 10; // static ����Ǿ��⿡ �ܺ� Ŭ���� ��ü �������� ���� ���
		iv++; // static ����ǿ��⿡ ���� Ŭ���� �������� �ʵ���� ���
	}

	public static String info( ) { // static ����Ǿ��⿡ ��ü �������� ���� ���
		return ("iv = " + iv);
	}

	public String toString( ) { // �ʵ���� toString �� �������̵��Ͽ� ��� ���� ����
		return ("iv = " + iv);
	}
}

public class StaticDemo {
	public static void main(String[ ] args) {
		MyClass.info( ); // static ����Ǿ��⿡ ��ü �������� �޼��带 ���� ȣ��
		MyClass a = new MyClass( ); // ��ü a ����
		a.increment( ); // static ���� �����Ƿ� ��ü ������ �� �޼��� ȣ��
		System.out.println(a); // toString( ) ��� ��������
	}
}