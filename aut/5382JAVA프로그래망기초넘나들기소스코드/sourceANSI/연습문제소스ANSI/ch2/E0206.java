import java.io.*;
public class E0206 {
 public static void main(String[ ] args) throws NumberFormatException, IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	double cm = 0.0, inch, feet;

	System.out.print("�ڽ��� Ű�� cm�� �Է��� �ּ���: ");		 
	cm = Integer.parseInt(br.readLine( ));
	inch = 2.54 * cm;
	feet = 12 * inch;
	System.out.println(cm + " ��Ƽ���� = " + feet + " ��Ʈ, " + inch + " ��ġ");
 }
}