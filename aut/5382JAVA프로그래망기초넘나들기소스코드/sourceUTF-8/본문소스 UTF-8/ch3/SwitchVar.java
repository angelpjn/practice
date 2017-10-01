import java.util.Scanner;

public class SwitchVar {
	public static void main(String[ ] args) {
		Scanner in = new Scanner(System.in);
		String creditRating;
		System.out.print("등급(1, 2, 3) : ");
		int rating = in.nextInt( ); // 키보드에서 정수 입력
		double rate;

		switch (rating) {
		case 1: rate = 0.01; break;
		case 2:	rate = 0.02; break;
		case 3:	rate = 0.03; break;
		default:		rate = 0.0; break;
		}

		System.out.println(rate);
		in.nextLine( ); // 버퍼 초기화
		System.out.print("등급(단일문자 A, B, C) : ");
		char grade = in.next().charAt(0); // 첫 글자 읽어들이기
		// char grade = reader.findInLine(".").charAt(0); // one character 읽기
		// char grade = reader.next(".").charAt(0); // one character 읽기
		if ((grade >= 97) && (grade <= 122)) {
			grade -= 32;
		} // grade = (char)(grade - 32); // 대문자로 변환
		switch (grade) {
		case 'A': rate = 0.01; break;
		case 'B': rate = 0.02; break;
		case 'C': rate = 0.03; break;
		default: 	rate = 0.0; break;
		}
		System.out.println(rate);
		in.nextLine( ); // 버퍼 초기화
		System.out.print("등급(문자열 A, B, C) : ");
		creditRating = in.nextLine( );
		switch (creditRating) {
		case "A": rate = 0.01; break;
		case "B": rate = 0.02; break;
		case "C": rate = 0.03; break;
		default: 	rate = 0.0; break;
		}

		System.out.println(rate);
		in.nextLine( ); // 버퍼 초기화
		in.close( );
	}
}