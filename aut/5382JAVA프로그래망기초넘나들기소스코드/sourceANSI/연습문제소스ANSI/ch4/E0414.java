public class E0414 {
	public static void main(String[ ] args) {	
		int[ ][ ] pyramid = { { 0 }, { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };

		for (int[ ] row : pyramid) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.print("\n");
		}
	}
}