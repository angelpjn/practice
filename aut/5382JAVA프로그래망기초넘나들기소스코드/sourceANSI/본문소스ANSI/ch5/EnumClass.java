enum AnimalCategory { // ���ŵ� 5 ������ ���
	DOG, CAT, LION, TIGER, ELEPHANT
}

class Animal {
	AnimalCategory type; // �ʵ�, ���ŵ� 5 ������ ���
	String size; // �ʵ�

	public void InitInfo( ) {
		this.type = AnimalCategory.DOG; // ��(.)���� ����
		this.size = "�;��� �۴�."; // this.�ʵ� , ���⼭�� this.�� �����ص� ����
	}

	public void showInfo( ) {
		System.out.println("���� �̸�: " + type);
		System.out.println("ũ�� : " + size);
	}

}
public class EnumClass {
	public static void main(String[ ] args) {
		Animal obj = new Animal( );
		obj.InitInfo( ); // �ʵ� ���� ������ ��
		obj.showInfo( ); // ����ؾ� ��(�� ������ ������ null (���� �����Ƿ�) ���
	}
}