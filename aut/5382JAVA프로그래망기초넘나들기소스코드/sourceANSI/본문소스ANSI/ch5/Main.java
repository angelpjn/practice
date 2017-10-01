import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[ ] args) {
		Scanner scan = new Scanner(System.in);
		int number;

		System.out.print("정수 입력: ");
		try {
			number = scan.nextInt( ); // 입력 정수 저장
			System.out.println("입력: " + number);
		}
		// 예외 발생시 InputMismatchException이면 이 블록만 실행
		catch (InputMismatchException e) {
			System.out.println("정수가 아님! ");
		}

		// Exception에 관한 예외가 발생하면 이 블록 실행
		catch (Exception e) {
			System.out.println("잘못 입력 ");
		} finally { // 무조건 실행
			scan.close( );
		}
	}
}