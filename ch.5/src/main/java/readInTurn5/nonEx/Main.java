
package readInTurn5.nonEx;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;
		
		System.out.print("정수 입력 : ");
		try {
			number = scan.nextInt();
			System.out.println("입력 : " + number);
		} catch (InputMismatchException e) {
			System.out.println("정수가 아님");
			
		} catch (Exception e) {
			System.out.println("잘못 입력");
		} finally {
			scan.close();
		}
	}
}