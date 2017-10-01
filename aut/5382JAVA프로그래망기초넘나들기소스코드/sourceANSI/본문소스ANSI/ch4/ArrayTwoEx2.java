import java.util.Arrays;

public class ArrayTwoEx2 {
	public static void main(String[ ] args) {
		int[ ][ ] ar = { { 10, 20, 30, 40 }, { 15, 24, 35, 45 },
				{ 50, 60, 70, 80 } };

		System.out.println("요소: " + Arrays.deepToString(ar));

		// 2차원 배열의 요소들 하나씩 출력
		for (int row = 0, size = ar.length; row < size; row++) {
			for (int col = 0, count = ar[row].length; col < count; col++) {
				System.out.print(ar[row][col] + " ");
			}
			System.out.println( ); // 줄바꿈
		}
		System.out.println( ); 

		// for~each 루프 사용하여 2차원 배열의 요소들 하나씩 출력
		for (int[ ] row : ar) {
			for (int e : row) {
				System.out.print(e + " ");
			}
			System.out.println( );// 줄바꿈
		}
	}
}