import java.util.Arrays;

public class ArrayTwoEx2 {
	public static void main(String[ ] args) {
		int[ ][ ] ar = { { 10, 20, 30, 40 }, { 15, 24, 35, 45 },
				{ 50, 60, 70, 80 } };

		System.out.println("���: " + Arrays.deepToString(ar));

		// 2���� �迭�� ��ҵ� �ϳ��� ���
		for (int row = 0, size = ar.length; row < size; row++) {
			for (int col = 0, count = ar[row].length; col < count; col++) {
				System.out.print(ar[row][col] + " ");
			}
			System.out.println( ); // �ٹٲ�
		}
		System.out.println( ); 

		// for~each ���� ����Ͽ� 2���� �迭�� ��ҵ� �ϳ��� ���
		for (int[ ] row : ar) {
			for (int e : row) {
				System.out.print(e + " ");
			}
			System.out.println( );// �ٹٲ�
		}
	}
}