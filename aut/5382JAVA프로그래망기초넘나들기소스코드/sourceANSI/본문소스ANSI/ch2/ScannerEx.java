import java.util.Scanner;

public class ScannerEx {
	public static void main(String[ ] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("�����Ͽ� 3���� ���ڸ� �Է�(�������� ����): ");
		String str1 = scan.next( ); // ù��° �ܾ� �о����
		String str2 = scan.next( ); // �ι�° �ܾ� �о����
		String str3 = scan.next( ); // ����° �ܾ� �о����
		System.out.println(str1 + '\t' + str2 + '\t' + str3);

		int vi;
		double weight;
		System.out.print(" ���� �Է�: ");
		vi = scan.nextInt( ); // ���� �Է��� ���� ���ۿ� <����>�� �����ְ� �ǹǷ�
		System.out.println("����: " + vi);

		System.out.print(" ������ �Է�: ");
		weight = scan.nextDouble( ); // Ű���� ���� Double�� �Է�
		System.out.println("������: " + weight);
		scan.nextLine( ); // ���� �ʱ�ȭ�Ͽ� ���ۿ��� <����>�� �����ؾ� ���� ����
		
		System.out.print(" �ּ� �Է�: ");
		String address = scan.nextLine( );
		System.out.println("�ּ�: " + address);
		scan.close( );

		Scanner sc = new Scanner("2030/08/15");
		sc.useDelimiter("/");
		while (sc.hasNext( )) {
			System.out.print(sc.next( ) + "\t");
		}
		System.out.println(" --- end --- ");
		sc.close( );
	}
}