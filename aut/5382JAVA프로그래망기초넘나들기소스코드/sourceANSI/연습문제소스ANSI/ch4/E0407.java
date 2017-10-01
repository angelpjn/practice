import java.util.Arrays;

public class E0407 {
	public static void main(String[ ] args) {

		int[ ] a = { 9, 3, 6, 2, 8 };
		int[ ] b = a.clone( );
		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "] = " + b[i] + ", ");
		}
		System.out.println( );

		char[ ] d = { 'C', 'a', 'n' };
		int[ ] e = null;
		System.out.println("d 요소: " + Arrays.toString(d));
		System.out.println("e 요소: " + Arrays.toString(e));
	}
}