public class ConstructorEx {
	String name; // 필드, 인스턴스 변수로 동작, 참조 타입과
	int age; // 기본 타입, toString( ) 재정의해야 혼합된 형태로 출력 가능

	ConstructorEx( ) { } // 기본 생성자: 정의하지 않으면 컴파일러가 자동 삽입

	@Override
	public String toString( ) { // 기본 타입과 참조 타입이 혼합된 출력 형태
		return "name : " + name + "\tage :" + age; // Overriding(재정의)
	}

	public static void main(String[ ] args) {
		ConstructorEx c = new ConstructorEx( ); // 객체 생성
		c.age = 20; // 객체명.필드, 숫자이므로 값 그대로 표기
		c.name = "홍 길동"; // 문자열이므로 "문자열"로 표기

		// 기본 타입과 참조 타입이 혼합된 형태는 출력 불가
		// System.out.println("name : " + name + "\tage :" + age);
		System.out.println(c); // 해결: toString( ) 형태로 출력
	}
}