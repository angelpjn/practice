public class Course {
	private String name; // 필드(변수)

	public Course( ) { // 기본 생성자, 매개변수 없음
		this("생성자에서 다른 생성자 Course(String name) 호출");
		System.out.println(name);
		System.out.println("기본 생성자 Course( ) 호출");
	}

	public Course(String name) { // 매개변수 있는 생성자
		this.name = name; // 매개변수와 필드가 동일하므로 this.필드
	}

	public void setName(String n) { // 메서드
		name = n; // 필드 = 매개변수
	}

	public String getName( ) { // 메서드, 리턴 타입은 String
		return name; // 리턴 타입이 void가 아니므로 꼭 return 문 작성
	}

	// 자바 프로그램은 메서드 main에서 실행 시작
	public static void main(String[ ] args) {
		Course cpp = new Course("C++"); // 객체 cpp 생성
		Course java = new Course( ); // 객체 java 생성

		java.setName("JAVA"); // 메서드 setName( ) 호출
		System.out.println("Course name: " + java.getName( ));
		System.out.println("Course name: " + cpp.getName( ));
	}
}