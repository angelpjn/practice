import java.util.Scanner;

public class IfElse {
	public static void main(String[ ] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("정수 입력: ");
		int number = in.nextInt( ); // 키보드에서 정수 입력

		if (number % 3 == 0) // 3의 배수인 경우
			System.out.println(number + " -> 3의 배수입니다.\n");
		else
			// 그 이외인 경우
			System.out.println(number + " -> 3의 배수가 아닙니다.\n");
		in.close( ); // Scanner 닫기
	}
}