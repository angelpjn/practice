import java.io.*;
public class E0304 {
 public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	char a;
	System.out.print("���� ���� �Է� : ");
	a = (char) System.in.read();
	br.readLine();
	if (a >= 'A' && a <= 'Z')
		System.out.println((char) (a - ('A' - 'a'))); // �ҹ��ڷ� ��ȯ
	else if (a >= 'a' && a <= 'z')
		System.out.println((char) (a - ('a' - 'A'))); // �빮�ڷ� ��ȯ
	}
}