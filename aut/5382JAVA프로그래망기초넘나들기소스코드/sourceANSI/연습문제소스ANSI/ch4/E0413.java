public class E0413 {
	public static void main(String[] args) {
		int[][] scores = { { 86, 92, 85 }, { 70, 89, 88 }, { 95, 98, 94 },
				{ 73, 76, 80 } };

		double[][] grades = new double[4][5];

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

		int sumA = 0, sumB = 0, sumC = 0;

		for (int i = 0; i < scores.length; i++) {
			// int sum = 0;
			sumA += scores[i][0]; // Ã¹¹øÂ° °ú¸ñ ÃÑÁ¡
			sumB += scores[i][1]; // 2¹øÂ° °ú¸ñ ÃÑÁ¡
			sumC += scores[i][2]; // 3¹øÂ° °ú¸ñ ÃÑÁ¡
		}
		System.out.println("[°¢ °ú¸ñº° ÃÑÁ¡/Æò±Õ] ");
		System.out.println(sumA + " /" + sumB + " /" + sumC);
		System.out
				.printf("%.2f//%.2f//%.2f\n", sumA / 4., sumB / 4., sumC / 4.);
	}
}