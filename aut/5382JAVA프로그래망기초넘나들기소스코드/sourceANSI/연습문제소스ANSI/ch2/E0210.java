import java.io.*;
public class E0210 {
  public static void main(String[ ] args) throws NumberFormatException,IOException {
	BufferedReader br = new BufferedReader(new 
                                  InputStreamReader(System.in));

	int diff;
	char large; // �빮��
	char small; // �ҹ���
	System.out.print("���ĺ� �빮�ڸ� �Է� : ");
	large = (char) System.in.read( );
	br.readLine( );
	diff = 'a' - 'A'; // 'A' �� 'a'�� ���� ������ ASCII �ڵ� ����
	small = (char) (large + diff); // �ҹ��ڷ� ��ȯ
	System.out.println(large + " �ҹ��� ��ȯ : " + small);
	}
}