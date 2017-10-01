class Flow {
	String type;
	String color;
	String arrangement;
	double unitPrice;

	public Flow(String t, String c, String a, double p) {
		type = t;
		color = c;
		arrangement = a;
		unitPrice = p;
	}

	// Flower ��ü�� �Ű������� �����ϱ�, static �����̴� ��ü �������� ���� ȣ��
	private static void showInfo(Flow[ ] f) {
		f = new Flow[ ] { new Flow("ī���̼�", "����", "�ٱ���", 100.37),
				new Flow("���", "����", "ȭ��", 200.29),
				new Flow("��ȭ", "���", "�ɺ�", 300.15) };

		for (Flow e : f) { // ���� foreach ��
			System.out.println(e); // ��ü ��� ���
		}
	}

	public String toString( ) { // �������̵�(������)�� ��� ����
		return "����: " + type + ", ����: " + color + ", �غ�: " + arrangement
				+ ", ����: " + unitPrice;
	}
	
	public static void main(String[ ] args) {
		Flow[ ] f = new Flow[3];
		showInfo(f); // static ������ �޼��� ���� ȣ��
	}
}