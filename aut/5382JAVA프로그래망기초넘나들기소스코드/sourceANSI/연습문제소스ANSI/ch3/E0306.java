import java.io.*;
public class E0306 {
 public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String input;
	int grade;
	System.out.print("����(100�� ����) �Է� : ");
	input = br.readLine();
	grade = Integer.parseInt(input);
	switch (grade / 10) {
	case 10: case 9: System.out.println("A\n");
			 break;
	case 8:
			System.out.println("B\n");
			break;
	case 7:
			System.out.println("C\n");
			break;
	case 6:
			System.out.println("D\n");
			break;
	default:
			System.out.println("F\n");
			break;
	}
   }
}