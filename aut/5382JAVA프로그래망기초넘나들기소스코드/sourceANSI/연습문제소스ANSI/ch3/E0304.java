import java.io.*;
public class E0304 {
 public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String input;
	int year;
	System.out.print("�⵵ �Է� : ");
	input = br.readLine();
	year = Integer.parseInt(input);
	// 4�� �������� �������� 0�̸鼭, 100���� ���������� �������� 0�̸� ����
	if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		System.out.println(year + " : ����!");
	else
		System.out.println(year + " : ���!");
	}
}