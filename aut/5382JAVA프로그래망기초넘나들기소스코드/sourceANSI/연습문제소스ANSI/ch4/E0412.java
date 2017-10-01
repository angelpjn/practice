public class E0412 {
	public static void main(String[ ] args) {
		int[ ][ ] scores = { { 86, 92, 85 }, { 70, 89, 88 }, { 95, 98, 94 },
				{ 73, 76, 80 } };

		double[ ][ ] grades = new double[4][5];

		int row, column;
		double sum = 0, average;
		for (row = 0; row < scores.length; row++) {
			sum = 0;

			for (column = 0; column < 3; column++) {
				grades[row][column] = scores[row][column];
				sum = sum + grades[row][column];
			}
			grades[row][3] = sum; // ÃÑÁ¡ ÀúÀå
			average = sum / 3;
			grades[row][4] = average; // Æò±Õ ÀúÀå
		}

		System.out.println("[ÇÐ»ýº° °ú¸ñ ÃÑÁ¡/Æò±Õ] ");
		for (row = 0; row < scores.length; row++) {
			System.out.print("ÇÐ»ý" + (row + 1) + ": " + (int) grades[row][3]);
			String grade = String.format("%.2f", grades[row][4]);
			System.out.println(" / " + grade);
		}
	}
}