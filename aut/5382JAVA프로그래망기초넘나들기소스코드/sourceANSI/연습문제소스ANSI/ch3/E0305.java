import java.io.*;
public class E0305 {
 public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String input;
	int number;
	System.out.print("����(1~9) �Է��ϰ� EnterŰ: ");
	input = br.readLine();
	number = Integer.parseInt(input);
	switch (number) {
	case 1: 	case 3:	case 5:	case 7:	case 9:
		System.out.println("Ȧ��\n");
		break;

	case 2:	case 4:	case 6:	case 8:
		System.out.println("¦��\n");
		break;
	}
   }
}