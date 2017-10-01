import java.util.Arrays;
import java.util.Collections;

public class SortArray {
	public static void main(String[ ] args) {

		int[ ] ar = { 8, 3, 5, 9, 4, 1, 7, 2 };
		int[ ] revAr = new int[ar.length];
		Arrays.sort(ar); // �ø��������� ����
		System.out.println("����: " + Arrays.toString(ar)); // ����-> ���ڿ�

		for (int i = ar.length - 1; i >= 0; i--)
			System.out.print(ar[i] + ", ");
		System.out.println("�������� : " + Arrays.toString(ar));

		System.out.print("������������ ���: ");
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");
		System.out.println( );

		String[ ] name = { "Java", "C", "Oracle", "Eclpse" };
		Arrays.sort(name, Collections.reverseOrder( )); // ������������ ����
		System.out.println("name ����: " + Arrays.toString(name));

		Integer[ ] obj = toReferenc(ar); // ��ȯ �޼��� ȣ��
		System.out.print("[int -> Integer] : ");
		System.out.println(Arrays.toString(obj)); // ������ ���ڿ��� ��ȯ

		Integer[ ] obj2 = new Integer[ ] { 88, 77, 33 };
		int[ ] newObj2 = toPrimitive(obj2); // ��ȯ �޼��� ȣ��
		System.out.println("[Integer -> int] : ");
		for (int temp : newObj2) {
			System.out.println("\t\t" + temp);
		}
	}

	// int Ÿ���� Integer Ÿ������ ��ȯ�ϴ� toReferenc( ) �޼���
	public static Integer[ ] toReferenc(int[ ] ar) {
		Integer[ ] result = new Integer[ar.length];
		for (int i = 0; i < ar.length; i++) {
			result[i] = Integer.valueOf(ar[i]);
		}
		return result;
	}

	// Integer Ÿ���� int Ÿ������ ��ȯ�ϴ� toReferenc( ) �޼���
	public static int[ ] toPrimitive(Integer[ ] ar) {
		int[ ] result = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			result[i] = ar[i].intValue( );
		}
		return result;
	}
}