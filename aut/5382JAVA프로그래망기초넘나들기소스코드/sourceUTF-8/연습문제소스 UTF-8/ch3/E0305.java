import java.io.*;
public class E0305 {
 public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String input;
	int year;
	System.out.print("년도 입력 : ");
	input = br.readLine();
	year = Integer.parseInt(input);
	// 4로 나눴을때 나머지가 0이면서, 100으로 나눴을때는 나머지가 0이면 윤년
	if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		System.out.println(year + " : 윤년!");
	else
		System.out.println(year + " : 평년!");
	}
}