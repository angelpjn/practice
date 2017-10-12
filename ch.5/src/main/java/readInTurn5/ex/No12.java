
package readInTurn5.ex;

import java.util.Scanner;

public class No12 {
	int i;
	public int abs() {
			return i = - i;
		}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		No12 no12 = new No12();
		System.out.print("정수 입력 : ");
		no12.i = scan.nextInt();
		
		System.out.print("결과 출력 : " + no12.abs());
			
	}
	
}