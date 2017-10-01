public class E0316 {
	public static void main(String[] args) {
		int row; // 라인 개수 
		int space; // 공백 개수 
		int ch; // 출력 문자 개수 
		int line; // 아래 삼각형 라인 개수 
		// 다이아몬드 형태 중 상위 삼각형  
		for (row = 0; row < 3; row++) {
			for (space = 3; space > row; space--) {
				System.out.print(" "); // 각 행마다 필요한 공백 출력
			}

			// 출력 문자 *를 각 라인별로 필요한 개수만큼 출력
			for (ch = 0; ch <= row * 2; ch++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 다이아몬드 형태 중 아래 삼각형
		for (line = row; line >= 0; line--) {
			for (space = 3; space > line; space--) {
				System.out.print(" ");
			}

			for (ch = 0; ch <= line * 2; ch++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}