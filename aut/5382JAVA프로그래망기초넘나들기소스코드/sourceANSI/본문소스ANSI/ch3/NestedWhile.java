public class NestedWhile {
	public static void main(String args[ ]) {
		int outer = 1;
		while (outer < 3) {
			int inner = 10;
			while (inner < 15) {
				System.out.print(outer + " " + inner + "\t");
				inner++;
			}
			System.out.println( );
			outer++;
		}
	}
}