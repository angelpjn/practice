public class Continue {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 7; i++) { // block of statement
			if (i % 5 == 0)
				continue; // for ������ �̵�
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}