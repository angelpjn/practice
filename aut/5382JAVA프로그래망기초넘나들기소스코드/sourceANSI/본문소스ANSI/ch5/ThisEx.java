public class ThisEx {
	String name; // �ʵ�(��� ����), ���� Ÿ�԰�
	int age; // �⺻ Ÿ��, toString( ) �������ؾ� ȥ�յ� ���·� ��� ����

	ThisEx( ) {
		this("�̱���"); // �����ڰ� ȣ��, ThisEx(String name) ������ ȣ��
		// this("������", 30); // ����, ù��° ������ �ƴϱ� ����
	} // �⺻ ������: �������� ������ new ThisEx( );�� �����Ϸ� ����

	ThisEx(String name) { // �Ұ�ȣ ���� name�� �Ű�����, 
		this(name, 25); // �����ڰ� ȣ��, ThisEx(int age) ������ ȣ��
		this.name = name; // this.�ʵ�� = �Ű�����;
	}

	ThisEx(int age) {
		this.age = age; // this.�ʵ�� ���� ����, this�� �ڽ��� Ŭ����
	}

	ThisEx(String name, int age) {
		this.name = name; // �ʵ��� �Ű�������(�޼����(Ÿ�� �Ű�����) ���⿡
		this.age = age; // this.�ʵ�� ���� ����, this�� ��ü �ڽ�
	}

	@Override
	public String toString( ) { // ��ü �ʵ� ���� ����� ����, 
		return "name : " + name + "\tage :" + age; // Overriding(������)
	}

	public static void main(String[ ] args) {
		ThisEx obj = new ThisEx("ȫ�浿", 20); // ��ü ����
		ThisEx obj2 = new ThisEx("ȫ�浿"); // ��ü ����
		ThisEx obj3 = new ThisEx(20); // ��ü ����
		System.out.println(obj); // ��� �ʵ� �� ����� toString( ) ���·� ���
		System.out.println(obj2);
		System.out.println(obj3);
	}
}