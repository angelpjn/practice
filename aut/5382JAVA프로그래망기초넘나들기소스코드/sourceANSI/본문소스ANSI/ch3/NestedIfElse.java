import java.util.Scanner;

public class NestedIfElse {
	public static void main(String[ ] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("����: ");
		int age = in.nextInt(); // Ű���忡�� ���� �Է�

		if (age < 13) {
			System.out.println("���(child)");
		} else if (age < 19) {
			System.out.println("�ʴ�(budding teenager)");
		} else {
			if (age < 65) {
				System.out.println("����(adult)");
			} else {
				System.out.println("���(senior)");
			}
			in.close( );
		}
	}
}