import java.util.Scanner;

public class IfElse {
	public static void main(String[ ] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("���� �Է�: ");
		int number = in.nextInt( ); // Ű���忡�� ���� �Է�

		if (number % 3 == 0) // 3�� ����� ���
			System.out.println(number + " -> 3�� ����Դϴ�.\n");
		else
			// �� �̿��� ���
			System.out.println(number + " -> 3�� ����� �ƴմϴ�.\n");
		in.close( ); // Scanner �ݱ�
	}
}