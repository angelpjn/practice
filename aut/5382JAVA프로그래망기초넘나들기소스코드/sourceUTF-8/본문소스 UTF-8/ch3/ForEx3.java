public class ForEx3 {
	public static void main(String[ ] args) {
		int x = 1; // 초기값
		for ( ; ; ) { // 반복할 조건 검사, 무한 루프이다.
			System.out.print(x + "  ");
			x++; // 루프를 벗어날 조건을 변화시킴
			if (x > 5) // 루프를 벗어나기 위한 검사
				break;
		}
	}
}