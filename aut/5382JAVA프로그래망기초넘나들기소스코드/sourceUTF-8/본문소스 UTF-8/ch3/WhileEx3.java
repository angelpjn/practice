public class WhileEx3 {
	public static void main(String[ ] args) {
		double n = 1;
		while (true) {
			n = n + 0.5;
			if (n >= 5.0)
				break;
			System.out.printf("%.2f\t", n);
		}
		System.out.println( );
	}
}