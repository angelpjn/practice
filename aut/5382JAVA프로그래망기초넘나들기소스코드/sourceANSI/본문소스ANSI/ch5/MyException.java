import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyException {
	// throws IOException �� System.in.read( ) ���� ���� �߻�ó�� �뵵
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a;
		System.out.print("���� �Է�: ");
		a = Integer.parseInt(br.readLine()); // ���ڿ��� ���������� ����ȯ
      System.out.println(a);
	}
}