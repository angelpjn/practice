public class E0201 {
	public static void main(String[ ] args) {
		int vi = 10;

		// ���ڸ� 2����,8����,16���� ������ ���ڿ��� ��ȯ
		String bin = Integer.toBinaryString(vi); // 10���� -> 2����
		String oct = Integer.toOctalString(vi); // 10���� -> 8����
		String hex = Integer.toHexString(vi); // 10���� -> 16����

		System.out.println("2���� : " + bin);
		System.out.println("8����  : " + oct);
		System.out.println("16����: " + hex);
		System.out.println( );

		int n = 2; // ���ڿ� n������ ���ڷ� ��ȯ
		System.out.println("2���� -> 10���� : " + Integer.valueOf(bin, n));
		System.out.println(Integer.parseInt(bin, n)); // n���� -> 10����
	}
}