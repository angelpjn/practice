public class ConstructorEx2 {
	String name; // �ʵ�(��� ����), ���� Ÿ�� ��
	int age; // �⺻ Ÿ��, toString( ) �������ؾ� ȥ�յ� ���·� ��� ����

	// ConstructorEx2( ) {
	// } // �⺻ ������: �������� ������ new ConstructorEx2( ); �� �����Ϸ� ����

	ConstructorEx2(String name, int age) {
		this.name = name; // �ʵ��� �Ű�������(�޼����(Ÿ�� �Ű�����) ���⿡
		this.age = age; // this.�ʵ�� ���� ����, this�� ��ü �ڽ�
	}

	@Override
	public String toString( ) { // �⺻ Ÿ�԰� ���� Ÿ���� ȥ�յ� ��� ����
		return "name : " + name + "\tage :" + age; // Overriding(������)
	}

	public static void main(String[ ] args) {
		// ConstructorEx2 obj = new ConstructorEx2( ); // ����, �⺻������ ������
		ConstructorEx2 objc = new ConstructorEx2("ȫ�浿", 20); // ��ü ����
		System.out.println(objc); // �ذ�: toString( ) ���·� ���
	}
}