import java.io.IOException;
public class E0307 {
	public static void main(String[] args) throws IOException {
		int input;
		char ch;
		System.out.print("단일 문자 입력 : ");
		input = System.in.read(); // read()메소드는 int로 리턴
		ch = (char) input; // char로 변환해야 함
		switch (Character.toUpperCase(input)) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("모음");
			break;
		default:
			System.out.println("자음");
			break;
		}
	}
}