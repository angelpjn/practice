abstract class A {  // �߻� Ŭ���� ����, ���� Ŭ����
	public abstract String methodT( ); // �߻� �޼��� ����, ��ü { } �� ���� ����

	public void methodF( ) {
		System.out.println("Java");
	}
}

class B extends A { // A ��ӹ��� ���� Ŭ���� B, �߻� Ŭ���� ����
	public String methodT( ) { // �߻� �޼���� �������̵��Ͽ������ؾ� ��
		return "I can do it";
	}
}

public class AbstractEx {
	public static void main(String[ ] args) {
		// A obj = new A( ); // ������ ����, �߻� Ŭ������ ��ü ���� �Ұ�
		B obj = new B( ); // ��ü ����
		System.out.println(obj.methodT( ));
	}
}