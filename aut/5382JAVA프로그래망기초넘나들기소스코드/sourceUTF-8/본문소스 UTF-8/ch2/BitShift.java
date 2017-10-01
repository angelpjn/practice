public class BitShift {
	public static void main(String[ ] args) {
		int a = 12; // 2진수 0 0 0 0 1 1 0 0
		int b = 10; // 2진수 0 0 0 0 1 0 1 0
		System.out.println(a + " & " + b + " = " + (a & b)); // 논리합
		System.out.println(a + " | " + b + " = " + (a | b)); // 논리곱
		System.out.println(a + " ^ " + b + " = " + (a ^ b)); // 배타적 논리합(XOR)
		System.out.println("~12 = " + (~a)); // a 의 보수(반전)

		int x = 173; // 2진수 4바이트는 (000)(1 0 1 0 1 1 0 1)
		System.out.println(x + " << 2 = " + (x << 2)); // 왼쪽으로 2비트 이동
		// 비게 되는 오른쪽 두개 비트는 0 으로 채워짐, 1 0 1 0 1 1 0 1 0 0
		System.out.println(x + " >> 2 = " + (x >> 2)); // 오른쪽으로 2비트 이동
		         // 비게되는 왼쪽의 2개 비트는 이동하기 전 첫째 비트(MSB)                            //  값(0)으로 채워짐 (0 0 1 0 1 0 1 1), (0 1)은 삭제
		              // 오른쪽에서 2 비트 넘어간 부분은 삭제됨 
		System.out.println(x + " >>> 2 = " + (x >>> 2)); // 오른쪽 2비트 논리 이동
		     // 비게되는 왼쪽 2비트는 무조건 0으로 채워짐, (0 0 1 0 1 0 1 1), (0 1)
		              // 오른쪽으로 밀려난 2개 비트 01 은 삭제됨,
	}
}