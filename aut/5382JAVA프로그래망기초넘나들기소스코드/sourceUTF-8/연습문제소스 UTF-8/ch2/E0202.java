import java.util.Scanner;

public class E0202 {
	public static void main(String[ ] args) {
		int radius; // 반지름
		double circumference; // 원 둘레
		double circulaAreas; // 원 면적

		Scanner in = new Scanner(System.in);
		System.out.print("원의 반지름: ");
		radius = in.nextInt( ); // 정수로 읽어오기
		circumference = 2 * radius * 3.14;
		circulaAreas = radius * radius * 3.14;
		System.out.printf("원의 둘레: %.2f\n", circumference);
		System.out.printf("원의 면적: %.2f", circulaAreas);
		in.close( );
	}
}