public class E0410 {
	public static void main(String[ ] args) {
		String[ ][ ] fruits = { { "사과", "배" }, { "수박", "참외", "딸기" },
				{ "바나나", "토마토", "귤", "오렌지" } };

		for (int i = 0; i < fruits.length; i++) {
			System.out.print(fruits[i][0] + ": ");
			for (int j = 1; j < fruits[i].length; j++) {
				System.out.print(fruits[i][j] + " ");
			}
			System.out.println( );
		}
	}
}