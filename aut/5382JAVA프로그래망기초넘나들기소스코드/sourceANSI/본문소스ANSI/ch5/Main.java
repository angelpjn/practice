import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[ ] args) {
		Scanner scan = new Scanner(System.in);
		int number;

		System.out.print("���� �Է�: ");
		try {
			number = scan.nextInt( ); // �Է� ���� ����
			System.out.println("�Է�: " + number);
		}
		// ���� �߻��� InputMismatchException�̸� �� ��ϸ� ����
		catch (InputMismatchException e) {
			System.out.println("������ �ƴ�! ");
		}

		// Exception�� ���� ���ܰ� �߻��ϸ� �� ��� ����
		catch (Exception e) {
			System.out.println("�߸� �Է� ");
		} finally { // ������ ����
			scan.close( );
		}
	}
}