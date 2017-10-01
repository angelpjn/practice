public class PrintlnEx {
	public static void main(String[] args) {
		int x = 33; // 정수
		double y = 123.45; // 실수
		String str = "Java"; // 문자열
		String s = "Ok";

		System.out.println("I can do it."); // 문자열 출력, "문자열" 표기
		System.out.println("x = " + x); // 정수 출력, + 로 결합( , 불가)
		System.out.println("x = " + x + "\ty = " + y); // \t 는 Tab 기능
		System.out.println(); // 줄바꾸기, 엔터 기능(Enter 키), “\n”
		System.out.println("str = " + str); // 2개의 문자열 출력
		System.out.println(str + s); // 두 개의 문자열 결합한 문자열 출력

		System.out.printf("%.2f", y); // 소수점 이하 2자리 출력
	}
}