class A { // A ����� �ʵ�a �� B Ŭ���� ����
	private int a = 50; // �ʵ�

	class B { // ��� Ŭ����, A�� �ִ� ��� ��� ���� ����
		final static int SIZE = 100;
		int x = a; // ���� �ʵ� a�� �����Ͽ� ����
	}
}

public class TestClass {
	public static void main(String args[ ]) {
		A obj = new A( );

		// static���� ����� ��ø Ŭ������ �ƴϱ⿡ x = new A.B( ); ����
		A.B obj2; // A Ŭ������ ��ü�� �����ϰ� B Ŭ������ ��ü�� �����ؾ� ��
		obj2 = obj.new B( );
		System.out.println("SIZE = " + A.B.SIZE); // ����
	}
}