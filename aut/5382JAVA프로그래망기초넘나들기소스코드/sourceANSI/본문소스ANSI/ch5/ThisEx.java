public class ThisEx {
	String name; // 필드(멤버 변수), 참조 타입과
	int age; // 기본 타입, toString( ) 재정의해야 혼합된 형태로 출력 가능

	ThisEx( ) {
		this("이기자"); // 생성자간 호출, ThisEx(String name) 생성자 호출
		// this("정도령", 30); // 오류, 첫번째 문장이 아니기 때문
	} // 기본 생성자: 정의하지 않으면 new ThisEx( );시 컴파일러 오류

	ThisEx(String name) { // 소괄호 안의 name은 매개변수, 
		this(name, 25); // 생성자간 호출, ThisEx(int age) 생성자 호출
		this.name = name; // this.필드명 = 매개변수;
	}

	ThisEx(int age) {
		this.age = age; // this.필드명 으로 구분, this는 자신의 클래스
	}

	ThisEx(String name, int age) {
		this.name = name; // 필드명과 매개변수명(메서드명(타입 매개변수) 같기에
		this.age = age; // this.필드명 으로 구분, this는 객체 자신
	}

	@Override
	public String toString( ) { // 객체 필드 값을 출력할 형식, 
		return "name : " + name + "\tage :" + age; // Overriding(재정의)
	}

	public static void main(String[ ] args) {
		ThisEx obj = new ThisEx("홍길동", 20); // 객체 생성
		ThisEx obj2 = new ThisEx("홍길동"); // 객체 생성
		ThisEx obj3 = new ThisEx(20); // 객체 생성
		System.out.println(obj); // 모든 필드 값 출력은 toString( ) 형태로 출력
		System.out.println(obj2);
		System.out.println(obj3);
	}
}