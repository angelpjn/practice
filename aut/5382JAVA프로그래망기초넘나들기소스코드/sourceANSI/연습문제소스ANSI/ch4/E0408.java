import java.util.Scanner;
public class E0408 {
	public static void main(String[ ] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("[#1 문자열 입력]");
		String str = scan.nextLine( );
		System.out.println("[#1 문자열 역순으로 출력]");
		for (int i = str.length( ) - 1; i >= 0; i--)
			System.out.print(str.charAt(i));
	}
}