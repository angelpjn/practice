public class ForEx3 {
	public static void main(String[ ] args) {
		int x = 1; // �ʱⰪ
		for ( ; ; ) { // �ݺ��� ���� �˻�, ���� �����̴�.
			System.out.print(x + "  ");
			x++; // ������ ��� ������ ��ȭ��Ŵ
			if (x > 5) // ������ ����� ���� �˻�
				break;
		}
	}
}