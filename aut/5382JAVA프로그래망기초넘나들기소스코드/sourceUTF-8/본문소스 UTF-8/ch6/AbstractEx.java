abstract class A {  // 추상 클래스 선언, 슈퍼 클래스
	public abstract String methodT( ); // 추상 메서드 선언, 몸체 { } 가 없기 때문

	public void methodF( ) {
		System.out.println("Java");
	}
}

class B extends A { // A 상속받은 서브 클래스 B, 추상 클래스 구현
	public String methodT( ) { // 추상 메서드는 오버라이딩하여구현해야 함
		return "I can do it";
	}
}

public class AbstractEx {
	public static void main(String[ ] args) {
		// A obj = new A( ); // 컴파일 오류, 추상 클래스의 객체 생성 불가
		B obj = new B( ); // 객체 생성
		System.out.println(obj.methodT( ));
	}
}