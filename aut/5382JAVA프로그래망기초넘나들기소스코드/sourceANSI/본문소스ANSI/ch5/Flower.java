public class Flower {
	String type;
	String color;
	String arrangement;
	double unitPrice;

	public Flower(String t, String c, String a, double p) {
		type = t;
		color = c;
		arrangement = a;
		unitPrice = p;
	}

	public String toString( ) {
		return "�̸�: " + type + ", ����: " + color + ", �غ�: " + arrangement
				+ ", ����: " + unitPrice;
	}

	public static void main(String[ ] args) {
		Flower[ ] f = new Flower[3]; // Flower�� ���� 3���� ���۷��� �迭 ����

		f[0] = new Flower("ī���̼�", "����", "�ٱ���", 100.37);
		f[1] = new Flower("���", "����", "ȭ��", 200.29);
		f[2] = new Flower("��ȭ", "���", "�ɺ�", 300.15);

		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
	}
}