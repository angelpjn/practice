public class E0314 {
	public static void main(String[] args) {
		for (int row = 5; row >= 1; row--) {
			for (int space = 1; space <= 5 - row; space++) {
				System.out.print(" "); // 각 행마다 필요한 공백 출력
			}

			// 출력 문자 *를 각 라인별로 필요한 개수만큼 출력
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}