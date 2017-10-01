public class E0201 {
	public static void main(String[ ] args) {
		int vi = 10;

		// 숫자를 2진수,8진수,16진수 형태의 문자열로 변환
		String bin = Integer.toBinaryString(vi); // 10진수 -> 2진수
		String oct = Integer.toOctalString(vi); // 10진수 -> 8진수
		String hex = Integer.toHexString(vi); // 10진수 -> 16진수

		System.out.println("2진수 : " + bin);
		System.out.println("8진수  : " + oct);
		System.out.println("16진수: " + hex);
		System.out.println( );

		int n = 2; // 문자열 n진수를 숫자로 변환
		System.out.println("2진수 -> 10진수 : " + Integer.valueOf(bin, n));
		System.out.println(Integer.parseInt(bin, n)); // n진수 -> 10진수
	}
}