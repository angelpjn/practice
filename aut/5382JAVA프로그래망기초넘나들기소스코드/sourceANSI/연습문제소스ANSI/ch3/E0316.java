public class E0316 {
   public static void main(String[] args) {
	int dan; // �� ���θ��� 3�ܾ� ����� ī��Ʈ�� ����� �� ��

	for (int i = 0; i < 3; ++i) {
	   for (int j = 1; j <= 9; ++j) {
		for (int k = 1; k <= 3; ++k) {
			dan = i * 3 + (k + 1);
			if (dan > 9)
				break;
			System.out.print(dan + " X " + j + " = " + dan * j + "\t");
		}
		System.out.println();
	   }
	}
   }
}
