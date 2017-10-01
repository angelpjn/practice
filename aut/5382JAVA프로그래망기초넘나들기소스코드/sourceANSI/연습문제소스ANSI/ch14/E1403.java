import java.io.*;
import java.util.*;
public class E1403 {
	public static void main(String[ ] args) {
		BufferedReader br = null;
		String src = "";
		Scanner in = new Scanner(System.in);
		System.out.print("���� �̸� �Է�: ");
		src = in.nextLine( );

		try {
			br = new BufferedReader(new FileReader(src));
			String content; // �� ���� ����
			int count = 1; // ���� �� ��ȣ
			while (true) {
				content = br.readLine( );
				if (content == null) {
					break;
				}
				System.out.printf("%5d", count++); // �� ��ȣ ���
				System.out.println(":" + content); // �ҽ� ���� ���
			}
			if (br != null)
				br.close( );
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� ����");
		} catch (IOException e) {
			System.out.println("����� ���� �߻�!");
		}
	}
}