class Sub extends Object {
	void info( ) {
		System.out.println("���� Ŭ����");
	}

	public String toString( ) { // toString �������̵�: ��ü ��¿�
		return ("��ĳ���õ� ���� ������� �ٿ�ĳ����");
	}
}

public class UpDown {
	public static void main(String[ ] args) {
		// (����Ŭ���� < ����Ŭ����)�̹Ƿ� ����� ����ȯ�� ���� �ʾƵ�
		Object obj = new Sub( ); // ��ĳ����, �ڵ����� ����ȯ
		if (obj instanceof Sub) { // Ÿ�� Ȯ��
			Sub a = (Sub) obj; // ��ĳ���õȰ��� ������� �ٿ�ĳ����
			System.out.println("Sub: " + a);
		} else {
			System.out.println("Ÿ���� ��ġ���� ����");
		}
	}
}