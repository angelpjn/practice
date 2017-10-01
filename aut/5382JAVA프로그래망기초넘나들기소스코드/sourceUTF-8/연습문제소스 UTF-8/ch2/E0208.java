import java.io.*;
public class E0208 {
 public static void main(String[ ] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	double fd;
	System.out.print("화씨 온도(F) 입력: ");
	fd = Integer.parseInt(br.readLine( ));
	System.out.printf("화씨 온도 %.2f (F) = 섭씨 온도: %.2f (C)\n", fd,
			5.0 / 9.0 * (fd - 32.0));
	}
}