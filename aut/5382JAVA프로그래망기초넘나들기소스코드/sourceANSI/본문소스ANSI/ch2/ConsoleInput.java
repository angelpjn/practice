import java.io.IOException;

public class ConsoleInput {
	// throws IOException �� System.in.read( ) ���� ���� �߻� ó�� �뵵
	public static void main(String[ ] args) throws IOException {

		System.out.println(" �ϳ��� ������ �Է�: ");
		int vi = System.in.read( ); // �ƽ�Ű �ڵ�� ��ȯ�Ͽ� ����
		System.in.skip(2); // <���� '\r\n'>�� ���ۿ� �����ֱ⿡ 2 ���� ����

		System.out.println(" �ϳ��� ������ �Է�: ");
		int input = System.in.read( ); // ���������� ���� �� ���� �Է�
		System.in.skip(2); // <���� '\r\n'>�� ���ۿ� �����ֱ⿡ 2 ���� ����

		System.out.println(" �ϳ��� ������ �Է�: ");
		int input2 = System.in.read( ); // ���������� ���� �� ���� �Է�

		System.out.print(vi + " "); // ��� ���ڸ� �ƽ�Ű �ڵ�� ó��
		System.out.println((char) vi); // ���� �Է��� ���ڷ� ��ȯ�Ͽ� ���
		System.out.println((char) input); // ���� �Է��� ���ڷ� ��ȯ�Ͽ� ���
		System.out.println((char) input2); // ���� �Է��� ���ڷ� ��ȯ�Ͽ� ���
	}
}