public class MethodEx3 {
	String name;

	public String setName(String name) { // new ���� ��ü �����ؾ� ��� ����
		return name;
	}

	public void showMessage( ) { // new ���� ��ü �����ؾ� ��� ����
		System.out.println("Java");
	}

	// static ������ ��ü �����ؾ�������, ����: ��ü �������� ���� ��� ����
	public static void showMessage(String str) { // str �� �Ű�����
		System.out.println(str); // �Ű������� ���� ������ ����
	}

	public static void main(String[ ] args) {
		showMessage("I can do it."); // ���� ���, str �μ��� ���ڿ� ����

		MethodEx3 obj = new MethodEx3( ); // showMessage( ) ����ϱ� ����
		obj.showMessage( ); // new ���� ��ü ���� �� "��ü��.�޼���" �� ȣ��
		String name = obj.setName("ȫ �浿");
		System.out.println("�̸�: " + name);
	}
}