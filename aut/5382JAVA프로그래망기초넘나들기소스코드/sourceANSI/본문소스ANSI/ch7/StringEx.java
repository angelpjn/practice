public class StringEx {
	public static void main(String[ ] args) {
		String s = "I can do it";
		String s2 = "Java";

		String s3 = s + s2; // s 의 문자열 뒤에 s2 의 문자열을 덧붙임,
		System.out.println("s + s2: " + s3);

		String str = s.substring(5); // 끝에서 부터 5 번째 까지 부분 추출
		System.out.println("s.substring(5): " + str);

		String str2 = s.substring(0, 5); // 첫 번째(인덱스 0) 부터 6 번째 까지 추출
		System.out.println("s.substring(0, 5): " + str2);

		System.out.println("JAVA".toUpperCase( )); // 소문자로 변환, “java”

		System.out.println("\n   I can do it    \n".trim( )); // 앞뒤 공백 문자 제거

		System.out.println("Java".indexOf('J')); // J 위치의 인텍스 값, 0

		System.out.println(String.valueOf(3.14)); // 3.14 값을 문자열(‘3’, ‘1’, ‘4’)로 변환
		System.out.println(Integer.parseInt("88")); // "88" 문자열을 int 타입 변환
		System.out.println(Double.parseDouble("1.2")); // "1.2" 문자열을 double 변환
		String fmt = String.format("%10.2f%5d", 3.14, 8);
		System.out.println("String.format( ): " + fmt);

		char[ ] ch = "can".toCharArray( ); // “can” -> 배열 char[ ] ch = {‘c’, ‘a’, ‘n’}; 변환
		for (char e : ch) { // 처음부터 끝까지 루프 반복
			System.out.println(e);
		}
	}
}