public class WrapperEx1 {
	public static void main(String[ ] args) {

		char ch = 'A';
		int vi = 18;
		Integer i = new Integer(25);
		Double d = new Double(3.14);

		System.out.print(Character.getNumericValue(ch)); // 문자를 숫자로 변환
		System.out.print("\t" + Integer.parseInt("-38") + "\t"); // 문자열 -38을 정수로
		System.out.println(Character.valueOf('A')); // 래퍼 클래스

		System.out.print("이진수 : " + Integer.toBinaryString(vi));
		System.out.print("\t8진수 : " + Integer.toOctalString(vi));
		System.out.println("\t16진수 : " + Integer.toHexString(vi));

		String data = Integer.toString(88); // String 타입으로 변경, “88”
		System.out.print(i.doubleValue( )); // 정수를 double로 변환
		System.out.print("\t" + d.toString( ) + "\t"); // d 값을 문자열로
		System.out.println(Character.toLowerCase('D')); // 소문자 변환
	}
}