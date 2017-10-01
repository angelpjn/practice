public class RaggedArray {
	public static void main(String[ ] args) {
		int[ ][ ] a = { { 3, 6, 9, 12, 15 }, // 5¿­
				{ 4, 8, 16 }, // 3¿­
				{ 7, 14 }, // 2¿­
		};

		System.out.println("< Ragged Array >\n");
		for (int i = 0, size = a.length; i < size; i++) {
			for (int j = 0, count = a[i].length; j < count; j++) {
				System.out.print("array[" + i + "][" + j + "]= " + a[i][j]
						+ "\t");
			}
			System.out.println( );
		}
	}
}