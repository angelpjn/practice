public class OperatorsDemo {
	public static void main(String[ ] args) {

		char ch; // ���Ϲ��ڸ� ������ ���� ch ����
		int x; // ���� ���� ������ ���� x�� ����
		int sum = 2; // ���� �ʱ�ȭ, sum �����ϰ� 2 ����
		double y, z; // �Ǽ� ���� ������ ���� y�� ����

		x = 14; // ���� ���, 14�� �� �����Ͽ� ����
		y = 8.15;
		ch = 'A'; // ���Ϲ��� A�� ch�� ����

		sum += 3; // sum = sum + 3; �� ������ ��� ���� ������

		System.out.println(" x = " + x); // x�� �� ���
		System.out.println(" 2 + 3 = " + sum); // sum�� �� ���
		System.out.println(" 14 / 4 = " + x / 4);
		System.out.println(" 14. / 4 = " + (double) x / 4);
		System.out.println(" 7 % 4 = " + x % 4); // �������� 3 ���
		System.out.println(" 14 / 4 = " + x / 4);
	}
}