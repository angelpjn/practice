import java.util.Scanner;

public class E0203 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("단일문자 입력: ");
		String str = scan.next();
		int ascii;
		ascii = (int) str.charAt(0); // 한 글자를 아스키값으로 저장
		System.out.println(str + ", ASCII 값: " + ascii);
		scan.close();
	}
}
