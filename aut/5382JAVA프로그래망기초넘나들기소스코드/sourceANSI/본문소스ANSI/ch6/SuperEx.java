class A { // 슈퍼 클래스, 부모 클래스, 상위 클래스
	int vi; // 필드(멤버변수), 비공개(private)로 캡슐화
	String vs;

	public A( ) { // 기본 생성자, ( ) 이 비었거나 (void)
		vi = 5;
		vs = "Java";
	}

	public A(String vs) { // 매개변수 있는 생성자, (매개변수)
		this( ); // 자신의 클래스 A( ) 생성자 호출
		this.vs = "I Can do it."; // 필드에 매개변수의 값을 대입
	}

	public A(int vi, String vs) { // 매개변수 있는 생성자
		this(vs); // 자신의 클래스 A(String vi) 생성자 호출
		this.vi = vi; // 필드에 매개변수의 값을 대입
	}
}

class B extends A { // 서브 클래스, 자식 클래스, 하위 클래스
	int ve; // 필드(멤버변수), 비공개(private)로 캡슐화

	public B( ) { // 기본 생성자 
		super( ); // A 클래스의 A( ) 생성자 호출
		ve = 88;
	}

	public B(String Str) { // 매개변수 있는 생성자
		super(Str); // A 클래스의 A(String vs) 생성자 호출
		ve = 77; // 필드에 매개변수의 값을 대입
	}

	public B(int x, String st) { // 매개변수 있는 생성자
		super(x, st); // A 클래스의 A(int vi, String vs) 생성자 호출
		ve = 33; // 필드에 매개변수의 값을 대입
	}

	public B(int x, String st, int y) { // 매개변수 있는 생성자
		this(x, st); // 자신의 클래스의 B(int x, String st) 생성자 호출
		ve = y; // 필드명과 매개변수명이 다르므로 this 생략 가능
	}
}

public class SuperEx {
	// 자바 프로그램 시작은 main( )를 호출해서 실행
	public static void main(String args[ ]) {
		B object = new B( ); // 객체 생성
		System.out.println("멤버 ve = " + object.ve);
	}
}