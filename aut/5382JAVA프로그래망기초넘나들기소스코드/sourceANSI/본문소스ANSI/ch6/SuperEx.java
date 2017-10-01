class A { // ���� Ŭ����, �θ� Ŭ����, ���� Ŭ����
	int vi; // �ʵ�(�������), �����(private)�� ĸ��ȭ
	String vs;

	public A( ) { // �⺻ ������, ( ) �� ����ų� (void)
		vi = 5;
		vs = "Java";
	}

	public A(String vs) { // �Ű����� �ִ� ������, (�Ű�����)
		this( ); // �ڽ��� Ŭ���� A( ) ������ ȣ��
		this.vs = "I Can do it."; // �ʵ忡 �Ű������� ���� ����
	}

	public A(int vi, String vs) { // �Ű����� �ִ� ������
		this(vs); // �ڽ��� Ŭ���� A(String vi) ������ ȣ��
		this.vi = vi; // �ʵ忡 �Ű������� ���� ����
	}
}

class B extends A { // ���� Ŭ����, �ڽ� Ŭ����, ���� Ŭ����
	int ve; // �ʵ�(�������), �����(private)�� ĸ��ȭ

	public B( ) { // �⺻ ������ 
		super( ); // A Ŭ������ A( ) ������ ȣ��
		ve = 88;
	}

	public B(String Str) { // �Ű����� �ִ� ������
		super(Str); // A Ŭ������ A(String vs) ������ ȣ��
		ve = 77; // �ʵ忡 �Ű������� ���� ����
	}

	public B(int x, String st) { // �Ű����� �ִ� ������
		super(x, st); // A Ŭ������ A(int vi, String vs) ������ ȣ��
		ve = 33; // �ʵ忡 �Ű������� ���� ����
	}

	public B(int x, String st, int y) { // �Ű����� �ִ� ������
		this(x, st); // �ڽ��� Ŭ������ B(int x, String st) ������ ȣ��
		ve = y; // �ʵ��� �Ű��������� �ٸ��Ƿ� this ���� ����
	}
}

public class SuperEx {
	// �ڹ� ���α׷� ������ main( )�� ȣ���ؼ� ����
	public static void main(String args[ ]) {
		B object = new B( ); // ��ü ����
		System.out.println("��� ve = " + object.ve);
	}
}