import java.io.*;
public class E0305 {
 public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String input;
	int number;
	System.out.print("정수(1~9) 입력하고 Enter키: ");
	input = br.readLine();
	number = Integer.parseInt(input);
	switch (number) {
	case 1: 	case 3:	case 5:	case 7:	case 9:
		System.out.println("홀수\n");
		break;

	case 2:	case 4:	case 6:	case 8:
		System.out.println("짝수\n");
		break;
	}
   }
}