import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEX {
	// throws IOException �� System.in.read( ) ���� ���� �߻�ó�� �뵵
	public static void main(String[ ] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;
		System.out.print("���� �Է�: ");
		a = Integer.parseInt(br.readLine( )); // ���ڿ��� ���������� ����ȯ

		System.out.print("���� �Է�: ");
		b = Integer.parseInt(br.readLine( ));

		System.out.println(a + "\t" + b);

		System.out.print(" �����Ͽ� 3���� ���ڸ� �Է�: ");
		System.out.print((char) br.read( ) + "\t");
		System.out.print((char) br.read( ) + "\t");
		System.out.println((char) br.read( )); // �ƽ�Ű���� �ƴ� �Է��� ���� �״��
	}
}