import java.util.Scanner;

public class E0202 {
	public static void main(String[ ] args) {
		int radius; // ������
		double circumference; // �� �ѷ�
		double circulaAreas; // �� ����

		Scanner in = new Scanner(System.in);
		System.out.print("���� ������: ");
		radius = in.nextInt( ); // ������ �о����
		circumference = 2 * radius * 3.14;
		circulaAreas = radius * radius * 3.14;
		System.out.printf("���� �ѷ�: %.2f\n", circumference);
		System.out.printf("���� ����: %.2f", circulaAreas);
		in.close( );
	}
}