import java.util.Scanner;

public class E0203 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���Ϲ��� �Է�: ");
		String str = scan.next();
		int ascii;
		ascii = (int) str.charAt(0); // �� ���ڸ� �ƽ�Ű������ ����
		System.out.println(str + ", ASCII ��: " + ascii);
		scan.close();
	}
}
