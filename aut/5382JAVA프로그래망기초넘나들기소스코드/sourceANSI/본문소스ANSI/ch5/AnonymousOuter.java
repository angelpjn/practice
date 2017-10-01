class anonymousClass {
	public void method( ) {
		System.out.println("method( )");
	}
}

public class AnonymousOuter {
	public static void main(String[ ] args) {

		// 이름 없는 서브(자식, 하위) 클래스 생성,
		// 익명클래스 영역에는 멤버 선언을 오버라이딩한 경우만 가능함
		anonymousClass ac = new anonymousClass( ) {
			public void method( ) { // 외부 클래스의 메서드 오버라이딩
				System.out.println("method( ) 오버라이딩(재정의)");
			}
		}; // new anonymousClass( )에 { } 붙여서 익명 클래스 만듦(몸체 닫기)
		ac.method( );
	}
}