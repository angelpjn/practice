
package nonEx;

public class CharacterEx2 {
    public static void main(String[] args) {
        char ch1 = Character.forDigit(15, 16);
        System.out.println("0x15 = " + ch1);

        Character ch2 = new Character('B');
        System.out.println("B를 char로 변환 = " + ch2.charValue());

        int vi = Character.getNumericValue(ch2);
        System.out.println(vi);

        char[] toChars = Character.toChars('A');
        System.out.println("toChars[0] = " + toChars[0]);

        System.out.println("A의 ASCII 코드 = " + (int)'A');

        System.out.println("코드 65를 문자로 변환 = " + (char)65);

        System.out.println((char)0x41);

        char ch3 = 'A';
        char chLower3 = Character.toLowerCase(ch3);
        System.out.println("A 소문자 변환 = " + chLower3);

        char ch4 = 'A';
        char chLower4 = (char)(ch4 + 32);
        System.out.println("A 소문자 변환 = " + chLower4);
    }
}