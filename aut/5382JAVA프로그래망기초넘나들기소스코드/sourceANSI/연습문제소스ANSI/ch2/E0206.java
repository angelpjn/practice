import java.io.*;
public class E0206 {
 public static void main(String[ ] args) throws NumberFormatException, IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	double cm = 0.0, inch, feet;

	System.out.print("자신의 키를 cm로 입력해 주세요: ");		 
	cm = Integer.parseInt(br.readLine( ));
	inch = 2.54 * cm;
	feet = 12 * inch;
	System.out.println(cm + " 센티미터 = " + feet + " 피트, " + inch + " 인치");
 }
}