public class NestedFor {
	public static void main(String[ ] args) {
		int outer, inner;
		for (outer = 0; outer < 3; outer++) {
			for (inner = 0; inner < 4; inner++) {
				System.out.print("outer =  " + outer + " ");
				System.out.print("inner =  " + inner + ", ");
			}
			System.out.println( );
		}
	}
}