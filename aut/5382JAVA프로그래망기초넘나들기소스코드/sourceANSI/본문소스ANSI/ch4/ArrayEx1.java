public class ArrayEx1 {
	public static void main(String[ ] args) {
		int[ ] a = new int[ ] { 5, 8, 7, 6, 9 }; // �ʱ�ȭ

		for (int i = 0; i < a.length; i++) { // a �迭�� ũ�⸸ŭ ���� ó��
			System.out.print("a[" + i + "] = " + a[i] + ", ");
		}
		System.out.println( );

		for (int d : a) { // for ~ each ��(foreach ��)
			System.out.print(d + ", ");
		}
		System.out.println( );
	}
}