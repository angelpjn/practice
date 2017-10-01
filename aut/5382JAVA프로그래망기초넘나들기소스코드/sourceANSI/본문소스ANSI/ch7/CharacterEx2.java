public class CharacterEx2 {
	public static void main(String[ ] args) {
		char ch1 = Character.forDigit(15, 16); // 16진수 0x15
		System.out.println("0x15 = " + ch1);

		Character ch2 = new Character('B');
		System.out.println("B을 char으로 변환 = " + ch2.charValue( ));
		int vi = Character.getNumericValue(ch2);
		System.out.println(vi);

		char[ ] toChars = Character.toChars('A');
		System.out.println("toChars[0] : " + toChars[0]);

		System.out.println("A의 ASCII 코드= " + (int) 'A');
		System.out.format("0x%02X%n", (int) 'A'); // 16진수로 출력 0x41

		System.out.println("코드 65를 문자로 변환" + (char) 65); // A
		System.out.println((char) 0x41); // A (이것은 16진수로 'A'를 출력한 예제)

		char ch3 = 'A';
		char chLower3 = Character.toLowerCase(ch3); // Unicode 방식
		System.out.println("A 소문자 변환 = " + chLower3);

		char ch4 = 'A';
		char chLower4 = (char) (ch4 + 32); // ASCII 코드 빙식
		System.out.println("A 소문자 변환 = " + chLower3);
	}
}