public class E0313 {
	public static void main(String[] args) {
		for (int row = 0; row < 5; row++) {
			for (int col = 5; col > row; col--) {
				System.out.print(" "); // 각 행마다 필요한 공백 출력
			}

			// 출력 문자 *를 각 라인별로 필요한 개수만큼 출력
			for (int k = 0; k <= row; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}