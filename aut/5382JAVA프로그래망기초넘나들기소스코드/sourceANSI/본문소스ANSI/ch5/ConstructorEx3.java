public class ConstructorEx3 {
	String name;
	int age; // �⺻ Ÿ��, toString( ) �������ؾ� ȥ�յ� ���·� ��� ����

	ConstructorEx3( ) {
		this("�̱���", 25); // ConstructorEx3(String name, int age) ȣ��
	}

	ConstructorEx3(ConstructorEx3 c) { // �ν��Ͻ��� ���縦 ���� ������
		this("�̱���", 25); // ConstructorEx3(String name, int age) ȣ��
		name = c.name;
		age = c.age;
	}

	ConstructorEx3(String name, int age) {
		this.name = name; // �ʵ��� �Ű�������(�޼����(Ÿ�� �Ű�����) ���� ����
		this.age = age; // this.�ʵ�� ���� ����, this�� ��ü �ڽ�
	}

	@Override
	public String toString( ) { // �⺻ Ÿ�԰� ���� Ÿ���� ȥ�յ� ��� ����
		return "name : " + name + "\tage :" + age; // Overriding(������)
	}

	public static void main(String[ ] args) {
		ConstructorEx3 obj = new ConstructorEx3( );
		ConstructorEx3 obj2 = new ConstructorEx3(obj); // c1�� ���纻 ����
		obj2.name = "�� ����"; // obj �� �ν��Ͻ����� name �� ����
		obj2.age = 22;

		ConstructorEx3 obj3 = new ConstructorEx3("ȫ�浿", 20); // ��ü ����

		System.out.println(obj); // �ذ�: toString( ) ���·� ���
		System.out.println(obj2);
		System.out.println(obj3);
	}
}