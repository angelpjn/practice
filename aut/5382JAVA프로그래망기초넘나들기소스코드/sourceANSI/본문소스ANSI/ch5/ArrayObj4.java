class Flower {
	String type;
	String color;
	String arrangement;
	double unitPrice;

	public Flower( ) { }
	public Flower(String t, String c, String a, double p) {
		type = t;
		color = c;
		arrangement = a;
		unitPrice = p;
	}

	public String toString( ) { // �������̵�(������)�� ��� ����
		return "����: " + type + ", ����: " + color + ", �غ�: " + arrangement
				+ ", ����: " + unitPrice;
	}
}

class ObjectArray {
	public ObjectArray( ) {
	}

	// ���� Ÿ�� Flower[ ] �� ��ü �迭
	public Flower[ ] showInfo( ) {
		Flower[ ] f = new Flower[3]; // ��ü �迭 �ļ�
		f = new Flower[ ] { new Flower("ī���̼�", "����", "�ٱ���", 100.37),
				new Flower("���", "����", "ȭ��", 200.29),
				new Flower("��ȭ", "���", "�ɺ�", 300.15) };

		for (Flower e : f) { // ���� foreach ��
			System.out.println(e); // ��ü ��� ���
		}
		return f;
	}
}

public class ArrayObj4 {
	public static void main(String[ ] args) {
		ObjectArray obj = new ObjectArray( );
		Flower[ ] f = obj.showInfo( ); // �ż��� ȣ��
	}
}