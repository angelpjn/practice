public class E0315 {
	public static void main(String[] args) {
		for (int row = 0; row < 5; row++) {
			for (int col = 5; col > row; col--) {
				System.out.print(" ");
			}

			for (int count = 0; count <= row * 2; count++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}