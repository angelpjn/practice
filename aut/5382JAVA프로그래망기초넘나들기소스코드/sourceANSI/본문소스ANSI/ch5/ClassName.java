public class ClassName {
	private String name; // �ʵ�(�������), �����(private)�� ĸ��ȭ

	public void setName(String n) { // �Ű����� �ִ� �޼���
		name = n; // �ʵ� name�� �Ű����� n�� ���� ����
	}

	public String getName( ) { // �Ű����� ���� �޼���
		return name; // ����, ȣ���� �޼���� name ���� ����
	}

	// �ڹ� ���α׷� ������ main( ) �� ȣ���ؼ� ����
	public static void main(String args[ ]) {
		ClassName object = new ClassName( ); // ��ü ����
		object.setName("������"); // �޼��� ȣ��, �μ��� n�� ����
		System.out.println("�ȳ��ϼ���! " + object.getName( ));
	}
}