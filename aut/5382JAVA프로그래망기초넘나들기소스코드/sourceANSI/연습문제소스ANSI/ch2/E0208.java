import java.io.*;
public class E0208 {
 public static void main(String[ ] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	double fd;
	System.out.print("È­¾¾ ¿Âµµ(F) ÀÔ·Â: ");
	fd = Integer.parseInt(br.readLine( ));
	System.out.printf("È­¾¾ ¿Âµµ %.2f (F) = ¼·¾¾ ¿Âµµ: %.2f (C)\n", fd,
			5.0 / 9.0 * (fd - 32.0));
	}
}