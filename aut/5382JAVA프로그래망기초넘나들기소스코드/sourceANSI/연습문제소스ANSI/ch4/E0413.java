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
			grades[row][3] = sum; // ���� ����
			average = sum / 3;
			grades[row][4] = average; // ��� ����
		}

		System.out.println("[�л��� ���� ����/���] ");
		for (row = 0; row < scores.length; row++) {
			System.out.print("�л�" + (row + 1) + ": " + (int) grades[row][3]);
			String grade = String.format("%.2f", grades[row][4]);
			System.out.println(" / " + grade);
		}

		int sumA = 0, sumB = 0, sumC = 0;

		for (int i = 0; i < scores.length; i++) {
			// int sum = 0;
			sumA += scores[i][0]; // ù��° ���� ����
			sumB += scores[i][1]; // 2��° ���� ����
			sumC += scores[i][2]; // 3��° ���� ����
		}
		System.out.println("[�� ���� ����/���] ");
		System.out.println(sumA + " /" + sumB + " /" + sumC);
		System.out
				.printf("%.2f//%.2f//%.2f\n", sumA / 4., sumB / 4., sumC / 4.);
	}
}