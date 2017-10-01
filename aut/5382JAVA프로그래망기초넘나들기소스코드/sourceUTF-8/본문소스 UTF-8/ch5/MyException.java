import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyException {
	// throws IOException 는 System.in.read( ) 사용시 오류 발생처러 용도
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a;
		System.out.print("정수 입력: ");
		a = Integer.parseInt(br.readLine()); // 문자열을 정수값으로 형변환
      System.out.println(a);
	}
}