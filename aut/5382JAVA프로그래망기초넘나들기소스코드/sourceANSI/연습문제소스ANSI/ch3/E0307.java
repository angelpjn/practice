import java.io.IOException;
public class E0307 {
	public static void main(String[] args) throws IOException {
		int input;
		char ch;
		System.out.print("���� ���� �Է� : ");
		input = System.in.read(); // read()�޼ҵ�� int�� ����
		ch = (char) input; // char�� ��ȯ�ؾ� ��
		switch (Character.toUpperCase(input)) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("����");
			break;
		default:
			System.out.println("����");
			break;
		}
	}
}