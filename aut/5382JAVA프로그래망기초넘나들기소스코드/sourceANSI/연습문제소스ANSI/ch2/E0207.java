import java.io.*;
public class E0207 {
 public static void main(String[ ] args) throws NumberFormatException, IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int sec;
	System.out.print("�� �Է� : ");
	sec = Integer.parseInt(br.readLine( ));
	System.out.println(sec + " �� = " + sec / 3600 + " �� " + sec
			/ (3600 * 60) + " �� " + sec % 60 + " �� ");
	}
}