import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E0204 {
	public static void main(String[ ] args) {
		String a = null, b = null, c = null;
		System.out.print("3 / 5 ������ ���ʴ�� �Է�:");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			a = br.readLine( );
			b = br.readLine( );
			c = br.readLine( );
		} catch (IOException e) {
		}
		int d = Integer.parseInt(a); // ���ڸ� ���ڷ� �����Ѵ�
		int e = Integer.parseInt(c);
		double f;
		
		f = (double) d / e;
		System.out.println(a + " / " + c + " = " + f);
		}
	}