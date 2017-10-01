import java.io.*;
public class E0207 {
 public static void main(String[ ] args) throws NumberFormatException, IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int sec;
	System.out.print("초 입력 : ");
	sec = Integer.parseInt(br.readLine( ));
	System.out.println(sec + " 초 = " + sec / 3600 + " 시 " + sec
			/ (3600 * 60) + " 분 " + sec % 60 + " 초 ");
	}
}