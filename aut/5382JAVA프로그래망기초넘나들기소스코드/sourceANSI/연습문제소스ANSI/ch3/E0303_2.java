import java.io.*;
public class E0304 {
 public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	char a;
	System.out.print("단일 문자 입력 : ");
	a = (char) System.in.read();
	br.readLine();
	if (a >= 'A' && a <= 'Z')
		System.out.println((char) (a - ('A' - 'a'))); // 소문자로 변환
	else if (a >= 'a' && a <= 'z')
		System.out.println((char) (a - ('a' - 'A'))); // 대문자로 변환
	}
}