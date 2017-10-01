public class ForEx {
	public static void main(String[ ] args) {
		int x;
		double y;
		char z;

		for (x = 3; x <= 9; x++)
			System.out.print(x + "  ");
		System.out.println();

		for (x = 1; x <= 39; x += 3)
			System.out.print(x + "   ");
		System.out.println( );

		for (x = 14; x >= 2; x -= 2)
			System.out.print(x + "   ");
		System.out.println( );

		for (y = 0.1; y <= 1.0; y += 0.5)
			System.out.printf("%7.1f", y); // %.1f는 소수점 이하 1자리 출력
		System.out.println();

		for (z = 'a'; z <= 'g'; z++)
			System.out.print(z + "   ");
		System.out.println( );
	}
}