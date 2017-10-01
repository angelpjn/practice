public class StringEx {
	public static void main(String[ ] args) {
		String s = "I can do it";
		String s2 = "Java";

		String s3 = s + s2; // s �� ���ڿ� �ڿ� s2 �� ���ڿ��� ������,
		System.out.println("s + s2: " + s3);

		String str = s.substring(5); // ������ ���� 5 ��° ���� �κ� ����
		System.out.println("s.substring(5): " + str);

		String str2 = s.substring(0, 5); // ù ��°(�ε��� 0) ���� 6 ��° ���� ����
		System.out.println("s.substring(0, 5): " + str2);

		System.out.println("JAVA".toUpperCase( )); // �ҹ��ڷ� ��ȯ, ��java��

		System.out.println("\n   I can do it    \n".trim( )); // �յ� ���� ���� ����

		System.out.println("Java".indexOf('J')); // J ��ġ�� ���ؽ� ��, 0

		System.out.println(String.valueOf(3.14)); // 3.14 ���� ���ڿ�(��3��, ��1��, ��4��)�� ��ȯ
		System.out.println(Integer.parseInt("88")); // "88" ���ڿ��� int Ÿ�� ��ȯ
		System.out.println(Double.parseDouble("1.2")); // "1.2" ���ڿ��� double ��ȯ
		String fmt = String.format("%10.2f%5d", 3.14, 8);
		System.out.println("String.format( ): " + fmt);

		char[ ] ch = "can".toCharArray( ); // ��can�� -> �迭 char[ ] ch = {��c��, ��a��, ��n��}; ��ȯ
		for (char e : ch) { // ó������ ������ ���� �ݺ�
			System.out.println(e);
		}
	}
}