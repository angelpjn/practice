import java.io.*;
public class Ex3010 {
  public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String input;
	int number;
	System.out.print("10���� ���� �Է�: ");
	input = br.readLine();
	number = Integer.parseInt(input);
		
	// ��ǻ�Ͱ� 32��Ʈ�� ��� 32�� �ݺ�, i = 31 
	// 64��Ʈ�� 64�� �ݺ�, i = 63���� ����
	for (int i = 31; i >= 0; --i) {
		System.out.print(number >> i & 0x01);
	}
	System.out.println();
  }
}