public class E0401 {
	public static void main(String[ ] args) {
		double na[ ] = { 4.14, 5.25, 8.92, 4.26, 7.32 };
		for (int i = 0; i < na.length; i++) { // a �迭�� ũ�⸸ŭ ���� ó��
			System.out.print("a[" + i + "] = " + na[i] + ", ");
		}
		System.out.println( );

		for (double d : na) { // for ~ each ��, ó������ ������ ���� �ݺ�
			System.out.print(d + ", ");
		}
		System.out.println( );
	}
}