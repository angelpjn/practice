public class E0312 {
	public static void main(String[] args) {
		for (int row = 0; row < 5; row++) {
			for (int col = 5; col > row; col--) {
				System.out.print(" "); // �� �ึ�� �ʿ��� ���� ���
			}

			// ��� ���� *�� �� ���κ��� �ʿ��� ������ŭ ���
			for (int k = 0; k <= row; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}