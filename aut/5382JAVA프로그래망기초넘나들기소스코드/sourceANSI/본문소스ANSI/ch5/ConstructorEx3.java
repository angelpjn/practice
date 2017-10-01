public class ConstructorEx3 {
	String name;
	int age; // 기본 타입, toString( ) 재정의해야 혼합된 형태로 출력 가능

	ConstructorEx3( ) {
		this("이기자", 25); // ConstructorEx3(String name, int age) 호출
	}

	ConstructorEx3(ConstructorEx3 c) { // 인스턴스의 복사를 위한 생성자
		this("이기자", 25); // ConstructorEx3(String name, int age) 호출
		name = c.name;
		age = c.age;
	}

	ConstructorEx3(String name, int age) {
		this.name = name; // 필드명과 매개변수명(메서드명(타입 매개변수) 같기 때문
		this.age = age; // this.필드명 으로 구분, this는 객체 자신
	}

	@Override
	public String toString( ) { // 기본 타입과 참조 타입이 혼합된 출력 형태
		return "name : " + name + "\tage :" + age; // Overriding(재정의)
	}

	public static void main(String[ ] args) {
		ConstructorEx3 obj = new ConstructorEx3( );
		ConstructorEx3 obj2 = new ConstructorEx3(obj); // c1의 복사본 생성
		obj2.name = "나 변경"; // obj 의 인스턴스변수 name 값 변경
		obj2.age = 22;

		ConstructorEx3 obj3 = new ConstructorEx3("홍길동", 20); // 객체 생성

		System.out.println(obj); // 해결: toString( ) 형태로 출력
		System.out.println(obj2);
		System.out.println(obj3);
	}
}