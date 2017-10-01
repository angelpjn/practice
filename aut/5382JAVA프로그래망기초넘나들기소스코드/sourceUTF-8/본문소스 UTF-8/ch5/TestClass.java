class A { // A 블록은 필드a 와 B 클래스 갖음
	private int a = 50; // 필드

	class B { // 멤버 클래스, A에 있는 모든 멤버 참조 가능
		final static int SIZE = 100;
		int x = a; // 직접 필드 a에 접근하여 대입
	}
}

public class TestClass {
	public static void main(String args[ ]) {
		A obj = new A( );

		// static으로 선언된 중첩 클래스가 아니기에 x = new A.B( ); 오류
		A.B obj2; // A 클래스의 객체를 생성하고 B 클래스의 객체를 생성해야 함
		obj2 = obj.new B( );
		System.out.println("SIZE = " + A.B.SIZE); // 가능
	}
}