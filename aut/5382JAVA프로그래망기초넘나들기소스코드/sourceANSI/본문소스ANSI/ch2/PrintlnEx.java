public class PrintlnEx {
	public static void main(String[] args) {
		int x = 33; // ����
		double y = 123.45; // �Ǽ�
		String str = "Java"; // ���ڿ�
		String s = "Ok";

		System.out.println("I can do it."); // ���ڿ� ���, "���ڿ�" ǥ��
		System.out.println("x = " + x); // ���� ���, + �� ����( , �Ұ�)
		System.out.println("x = " + x + "\ty = " + y); // \t �� Tab ���
		System.out.println(); // �ٹٲٱ�, ���� ���(Enter Ű), ��\n��
		System.out.println("str = " + str); // 2���� ���ڿ� ���
		System.out.println(str + s); // �� ���� ���ڿ� ������ ���ڿ� ���

		System.out.printf("%.2f", y); // �Ҽ��� ���� 2�ڸ� ���
	}
}