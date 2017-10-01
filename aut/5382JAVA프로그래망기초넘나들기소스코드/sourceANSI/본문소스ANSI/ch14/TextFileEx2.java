import java.io.*;

public class TextFileEx2 {
	public static void main(String[ ] args) {
		String fileName = "C:\\work\\java\\text1.txt";
		BufferedReader bf;
		int ch;
		try {
			bf = new BufferedReader(new FileReader(fileName));
			while ((ch = bf.read( )) != -1) { // �� ���ھ� ���� ������ �б�
				System.out.print((char) ch); // ���
			}       
			bf.close( );
		} catch (FileNotFoundException e1) {
			e1.printStackTrace( );
		} catch (Exception e) {
			System.out.println("���� ���� ����");
		}
	}
}