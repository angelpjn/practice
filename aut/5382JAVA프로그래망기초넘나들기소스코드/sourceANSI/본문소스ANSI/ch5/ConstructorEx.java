public class ConstructorEx {
	String name; // �ʵ�, �ν��Ͻ� ������ ����, ���� Ÿ�԰�
	int age; // �⺻ Ÿ��, toString( ) �������ؾ� ȥ�յ� ���·� ��� ����

	ConstructorEx( ) { } // �⺻ ������: �������� ������ �����Ϸ��� �ڵ� ����

	@Override
	public String toString( ) { // �⺻ Ÿ�԰� ���� Ÿ���� ȥ�յ� ��� ����
		return "name : " + name + "\tage :" + age; // Overriding(������)
	}

	public static void main(String[ ] args) {
		ConstructorEx c = new ConstructorEx( ); // ��ü ����
		c.age = 20; // ��ü��.�ʵ�, �����̹Ƿ� �� �״�� ǥ��
		c.name = "ȫ �浿"; // ���ڿ��̹Ƿ� "���ڿ�"�� ǥ��

		// �⺻ Ÿ�԰� ���� Ÿ���� ȥ�յ� ���´� ��� �Ұ�
		// System.out.println("name : " + name + "\tage :" + age);
		System.out.println(c); // �ذ�: toString( ) ���·� ���
	}
}