import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E0204 {
	public static void main(String[ ] args) {
		String a = null, b = null, c = null;
		System.out.print("3 / 5 계산식을 차례대로 입력:");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			a = br.readLine( );
			b = br.readLine( );
			c = br.readLine( );
		} catch (IOException e) {
		}
		int d = Integer.parseInt(a); // 문자를 숫자로 변경한다
		int e = Integer.parseInt(c);
		double f;
		
		f = (double) d / e;
		System.out.println(a + " / " + c + " = " + f);
		}
	}