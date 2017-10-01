public class ConstructorEx2 {
	String name; // 필드(멤버 변수), 참조 타입 과
	int age; // 기본 타입, toString( ) 재정의해야 혼합된 형태로 출력 가능

	// ConstructorEx2( ) {
	// } // 기본 생성자: 정의하지 않으면 new ConstructorEx2( ); 는 컴파일러 오류

	ConstructorEx2(String name, int age) {
		this.name = name; // 필드명과 매개변수명(메서드명(타입 매개변수) 같기에
		this.age = age; // this.필드명 으로 구분, this는 객체 자신
	}

	@Override
	public String toString( ) { // 기본 타입과 참조 타입이 혼합된 출력 형태
		return "name : " + name + "\tage :" + age; // Overriding(재정의)
	}

	public static void main(String[ ] args) {
		// ConstructorEx2 obj = new ConstructorEx2( ); // 오류, 기본생성자 없으면
		ConstructorEx2 objc = new ConstructorEx2("홍길동", 20); // 객체 생성
		System.out.println(objc); // 해결: toString( ) 형태로 출력
	}
}