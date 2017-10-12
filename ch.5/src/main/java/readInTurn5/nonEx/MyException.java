
package readInTurn5.nonEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyException {
	public static void main(String[] args) throws NumberFormatException,
		IOException {
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			int a;
			System.out.print("정수 입력 : ");
			a = Integer.parseInt(br.readLine());
			System.out.println(a);
		
	}
}