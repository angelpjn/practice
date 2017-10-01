public class CharacterEx2 {
	public static void main(String[ ] args) {
		char ch1 = Character.forDigit(15, 16); // 16���� 0x15
		System.out.println("0x15 = " + ch1);

		Character ch2 = new Character('B');
		System.out.println("B�� char���� ��ȯ = " + ch2.charValue( ));
		int vi = Character.getNumericValue(ch2);
		System.out.println(vi);

		char[ ] toChars = Character.toChars('A');
		System.out.println("toChars[0] : " + toChars[0]);

		System.out.println("A�� ASCII �ڵ�= " + (int) 'A');
		System.out.format("0x%02X%n", (int) 'A'); // 16������ ��� 0x41

		System.out.println("�ڵ� 65�� ���ڷ� ��ȯ" + (char) 65); // A
		System.out.println((char) 0x41); // A (�̰��� 16������ 'A'�� ����� ����)

		char ch3 = 'A';
		char chLower3 = Character.toLowerCase(ch3); // Unicode ���
		System.out.println("A �ҹ��� ��ȯ = " + chLower3);

		char ch4 = 'A';
		char chLower4 = (char) (ch4 + 32); // ASCII �ڵ� ����
		System.out.println("A �ҹ��� ��ȯ = " + chLower3);
	}
}