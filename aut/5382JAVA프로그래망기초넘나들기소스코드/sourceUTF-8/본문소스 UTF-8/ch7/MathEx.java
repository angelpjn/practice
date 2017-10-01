public class MathEx {
	// 지정된 범위의 정수 난수 발생, [ n1 , n2 ] 
	// n1 은 "하한값", n2 는 상한값
	public static int randomRange(int n1, int n2) {
		return (int) (Math.random( ) * (n2 - n1 + 1)) + n1;
	}

	public static void main(String[ ] args) {
		// 래디안 = 원주율 / ∏(파이), 1 라디안은 약 57.3도
		double ratio = 180 / 3.14159265358979323846;

		System.out.println("|-9| = " + Math.abs(-9));
		System.out.println("sqrt(9) = " + Math.sqrt(9));
		System.out.println("pow(" + 3 + ") = " + Math.pow(2, 3));

		// 삼각함수는 도수를 래디안으로 변환하여 계산함
		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.sin(30 / ratio)); // 위와 동일

		// 3 ~ 7 사이의 정수 난수 구하기
		for (int i = 1; i <= 5; i++) {
			System.out.print(randomRange(3, 7) + " , ");
		}
		System.out.println( );
	}
}