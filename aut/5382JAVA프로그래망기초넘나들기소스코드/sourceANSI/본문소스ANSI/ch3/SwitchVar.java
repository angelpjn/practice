import java.util.Scanner;

public class SwitchVar {
	public static void main(String[ ] args) {
		Scanner in = new Scanner(System.in);
		String creditRating;
		System.out.print("���(1, 2, 3) : ");
		int rating = in.nextInt( ); // Ű���忡�� ���� �Է�
		double rate;

		switch (rating) {
		case 1: rate = 0.01; break;
		case 2:	rate = 0.02; break;
		case 3:	rate = 0.03; break;
		default:		rate = 0.0; break;
		}

		System.out.println(rate);
		in.nextLine( ); // ���� �ʱ�ȭ
		System.out.print("���(���Ϲ��� A, B, C) : ");
		char grade = in.next().charAt(0); // ù ���� �о���̱�
		// char grade = reader.findInLine(".").charAt(0); // one character �б�
		// char grade = reader.next(".").charAt(0); // one character �б�
		if ((grade >= 97) && (grade <= 122)) {
			grade -= 32;
		} // grade = (char)(grade - 32); // �빮�ڷ� ��ȯ
		switch (grade) {
		case 'A': rate = 0.01; break;
		case 'B': rate = 0.02; break;
		case 'C': rate = 0.03; break;
		default: 	rate = 0.0; break;
		}
		System.out.println(rate);
		in.nextLine( ); // ���� �ʱ�ȭ
		System.out.print("���(���ڿ� A, B, C) : ");
		creditRating = in.nextLine( );
		switch (creditRating) {
		case "A": rate = 0.01; break;
		case "B": rate = 0.02; break;
		case "C": rate = 0.03; break;
		default: 	rate = 0.0; break;
		}

		System.out.println(rate);
		in.nextLine( ); // ���� �ʱ�ȭ
		in.close( );
	}
}