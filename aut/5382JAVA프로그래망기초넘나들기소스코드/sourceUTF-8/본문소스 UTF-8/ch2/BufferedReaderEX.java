import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEX {
	// throws IOException 는 System.in.read( ) 사용시 오류 발생처러 용도
	public static void main(String[ ] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;
		System.out.print("정수 입력: ");
		a = Integer.parseInt(br.readLine( )); // 문자열을 정수값으로 형변환

		System.out.print("정수 입력: ");
		b = Integer.parseInt(br.readLine( ));

		System.out.println(a + "\t" + b);

		System.out.print(" 연속하여 3개의 문자를 입력: ");
		System.out.print((char) br.read( ) + "\t");
		System.out.print((char) br.read( ) + "\t");
		System.out.println((char) br.read( )); // 아스키값이 아닌 입력한 문자 그대로
	}
}