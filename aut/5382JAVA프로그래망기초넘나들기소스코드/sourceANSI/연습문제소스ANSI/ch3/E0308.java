public class E0308 {
	public static void main(String[] args) {
		int sum = 0;
		int x = 0;

		while (x <= 100) // 100�� �� �� ���� �ݺ�
		{
			sum += x; // �Ϲ� ���� ����
			x++; // x = x + 1
		}
		System.out.println("1 + 2 + ... + 100 = " + sum);

	}
}