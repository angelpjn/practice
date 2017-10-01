import java.io.*;
public class E1401 {
   public static void main(String[ ] args) {
	BufferedReader br = null;
	char buf[ ] = new char[256];
	try {
		br = new BufferedReader(new FileReader("c:\\work\\java\\base.txt"),
				buf.length);
		int numRead = 1; // ù��° while�� �ݺ��� ���� ��
		while (numRead > 0) {
			numRead = br.read(buf, 0, buf.length);
			if (numRead > 0) {
				String str = new String(buf, 0, numRead); // ���� �迭�� 
				System.out.print(str.toLowerCase( )); // �ҹ��� ��ȯ ��
			}
		}
		if (br != null)
			br.close( );
	} catch (FileNotFoundException e) {
		System.out.println("������ ����!");
	} catch (IOException e) {
		System.out.println("����� ������ �߻�!");
	}
   }
}