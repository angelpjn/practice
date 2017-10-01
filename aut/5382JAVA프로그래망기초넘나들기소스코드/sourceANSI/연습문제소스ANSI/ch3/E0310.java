import java.io.*;
public class Ex3010 {
  public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String input;
	int number;
	System.out.print("10진수 정수 입력: ");
	input = br.readLine();
	number = Integer.parseInt(input);
		
	// 컴퓨터가 32비트인 경우 32번 반복, i = 31 
	// 64비트면 64번 반복, i = 63으로 변경
	for (int i = 31; i >= 0; --i) {
		System.out.print(number >> i & 0x01);
	}
	System.out.println();
  }
}