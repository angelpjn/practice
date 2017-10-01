public class E0411 {
	public static void main(String[] args) {
		int[][] scores = { { 86, 92, 85 }, { 70, 89, 88 }, { 95, 98, 94 },
				{ 73, 76, 80 } };

		double[][] grades = new double[4][4];

		int row, column;
		double sum = 0, average;
		for (row = 0; row < scores.length; row++) {
			for (column = 0; column < 3; column++) {
				System.out.print(scores[row][column] + " ");
			}
			System.out.println();
		}
	}
}
