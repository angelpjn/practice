import java.util.Random;

public class E0706 {
	public static void main(String args[ ]) {
		int min = 7;
		int max = 15;

		Random r = new Random( );
		for (int i = 0; i < 5; i++) {
			int rm = r.nextInt(max - min + 1) + min;
			System.out.print(" " + rm);
		}
		System.out.println( );
	}
}