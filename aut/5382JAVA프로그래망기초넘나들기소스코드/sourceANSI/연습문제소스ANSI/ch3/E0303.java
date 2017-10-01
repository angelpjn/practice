import java.io.IOException;
import java.util.Scanner;
public class E0303 {
	public static void main(String[] args) throws IOException {
		int input; 
		int ch = 0;
		System.out.print("단일 문자 입력 : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); 
		ch = (int) str.charAt(0);
		if (ch >= 'A' && ch <= 'Z')
			ch = ch - ('A' - 'a');
		else if (ch >= 'a' && ch <= 'z')
			ch = ch - ('a' - 'A');
		System.out.println((char)ch);
	}
}