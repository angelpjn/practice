public class OperatorsDemo {
	public static void main(String[ ] args) {

		char ch; // 단일문자를 저장할 변수 ch 생성
		int x; // 정수 값을 저장할 변수 x를 생성
		int sum = 2; // 변수 초기화, sum 생성하고 2 대입
		double y, z; // 실수 값을 저장할 변수 y를 생성

		x = 14; // 변수 사용, 14를 에 대입하여 저장
		y = 8.15;
		ch = 'A'; // 단일문자 A를 ch에 저장

		sum += 3; // sum = sum + 3; 과 동일한 축약 대입 연산자

		System.out.println(" x = " + x); // x의 값 출력
		System.out.println(" 2 + 3 = " + sum); // sum의 값 출력
		System.out.println(" 14 / 4 = " + x / 4);
		System.out.println(" 14. / 4 = " + (double) x / 4);
		System.out.println(" 7 % 4 = " + x % 4); // 나머지값 3 출력
		System.out.println(" 14 / 4 = " + x / 4);
	}
}