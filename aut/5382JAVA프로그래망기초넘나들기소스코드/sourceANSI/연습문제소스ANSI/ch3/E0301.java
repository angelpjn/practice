import java.io.*;
public class E0301 {
  public static void main(String[] args) throws NumberFormatException,IOException {
	BufferedReader br = new BufferedReader(new                 
                                            InputStreamReader(System.in));
		int data = 0;

		System.out.print("정수 입력 : ");	
		data = Integer.parseInt(br.readLine());	

		if (data > 0)
			System.out.println("양수");
		else if (data < 0)
			System.out.println("음수");
		else if (data == 0)
			System.out.println("0");
	}
}