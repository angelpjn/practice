public class Course {
	private String name; // �ʵ�(����)

	public Course( ) { // �⺻ ������, �Ű����� ����
		this("�����ڿ��� �ٸ� ������ Course(String name) ȣ��");
		System.out.println(name);
		System.out.println("�⺻ ������ Course( ) ȣ��");
	}

	public Course(String name) { // �Ű����� �ִ� ������
		this.name = name; // �Ű������� �ʵ尡 �����ϹǷ� this.�ʵ�
	}

	public void setName(String n) { // �޼���
		name = n; // �ʵ� = �Ű�����
	}

	public String getName( ) { // �޼���, ���� Ÿ���� String
		return name; // ���� Ÿ���� void�� �ƴϹǷ� �� return �� �ۼ�
	}

	// �ڹ� ���α׷��� �޼��� main���� ���� ����
	public static void main(String[ ] args) {
		Course cpp = new Course("C++"); // ��ü cpp ����
		Course java = new Course( ); // ��ü java ����

		java.setName("JAVA"); // �޼��� setName( ) ȣ��
		System.out.println("Course name: " + java.getName( ));
		System.out.println("Course name: " + cpp.getName( ));
	}
}