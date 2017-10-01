import java.util.Scanner;

public class NestedIfElse {
	public static void main(String[ ] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("나이: ");
		int age = in.nextInt(); // 키보드에서 정수 입력

		if (age < 13) {
			System.out.println("어린이(child)");
		} else if (age < 19) {
			System.out.println("십대(budding teenager)");
		} else {
			if (age < 65) {
				System.out.println("성인(adult)");
			} else {
				System.out.println("어르신(senior)");
			}
			in.close( );
		}
	}
}