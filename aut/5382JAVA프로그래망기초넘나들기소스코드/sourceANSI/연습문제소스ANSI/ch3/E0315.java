public class E0315 {
	public static void main(String[] args) {
		int row; // ���� ���� 
		int space; // ���� ���� 
		int ch; // ��� ���� ���� 
		int line; // �Ʒ� �ﰢ�� ���� ���� 
		// ���̾Ƹ�� ���� �� ���� �ﰢ��  
		for (row = 0; row < 3; row++) {
			for (space = 3; space > row; space--) {
				System.out.print(" "); // �� �ึ�� �ʿ��� ���� ���
			}

			// ��� ���� *�� �� ���κ��� �ʿ��� ������ŭ ���
			for (ch = 0; ch <= row * 2; ch++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ���̾Ƹ�� ���� �� �Ʒ� �ﰢ��
		for (line = row; line >= 0; line--) {
			for (space = 3; space > line; space--) {
				System.out.print(" ");
			}

			for (ch = 0; ch <= line * 2; ch++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}