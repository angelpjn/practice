class MyClass {
	private static int iv = 0; // 모든 객체에서 공유

	void increment( ) {
		MyClass.iv = 10; // static 선언되었기에 외부 클래스 객체 생성없이 직접 사용
		iv++; // static 선언되였기에 같은 클래스 내에서는 필드명을 사용
	}

	public static String info( ) { // static 선언되었기에 객체 생성없이 직접 사용
		return ("iv = " + iv);
	}

	public String toString( ) { // 필드들은 toString 을 오버라이드하여 출력 형식 구현
		return ("iv = " + iv);
	}
}

public class StaticDemo {
	public static void main(String[ ] args) {
		MyClass.info( ); // static 선언되었기에 객체 생성없이 메서드를 직접 호출
		MyClass a = new MyClass( ); // 객체 a 생성
		a.increment( ); // static 선언 없으므로 객체 생성한 후 메서드 호출
		System.out.println(a); // toString( ) 출력 형식으로
	}
}