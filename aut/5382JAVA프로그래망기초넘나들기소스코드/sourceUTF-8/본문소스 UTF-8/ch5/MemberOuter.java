public class MemberOuter {
	private int outerDf = 0;
	private static int si = 55;
	int c = 77;

	void outerMethod( ) {
		System.out.println(c); // 외부 멤버
		System.out.println(outerDf); // 스태틱 외부 멤버
		System.out.println(this.si); // 인스턴스 외부 멤버
		MemberInner mi = new MemberInner( ); // Ok, 내부 클래스 객체 생성
		System.out.println("MemberInner( ) 호출: " + mi.x); // Ok, 내부 메서드 호출
	}

	// static 메서드는 static 또는 최상위 타입에서만 선언 가능
	static void outerSt( ) {
		// MemberInner mi = new MemberInner( ); // static, 내부 클래스 객체 생성 X
	}

	// 동적 내부 클래스(Non-static nested class, inner class, local(member) class)
	public class MemberInner {
		private int x = 33;
		int outerDf = 9;
		static final int b2 = 22; // static은 final 붙은 변수(상수 처리)만 가능

		// static int sy ; // 컴파일 오류
		// static int vs = 88; // non-static 내부 크래스에서 static 선언 불가
		// static void innerMethod( ) { } // static 메서드 선언 불가

		public void method( ) {
			int vm = si; // non-static -> static
			System.out.println("MemberOuter의 값 대입, vm = " + vm); // 55
			outerSt( ); // non-static -> static
			MemberOuter obj = new MemberOuter( ); // 객체 생성
			System.out.println(obj.si); // 인스턴스 외부 멤버
			System.out.println(this.x); // //인스턴스 내부 멤버

			MemberOuter.this.outerDf = 100; // Outer.this는 MemberOuter 객체 참조		   outerMethod( ); // non-static -> non-static, mi.xd의 값 33
			System.out.println("outerDf = " + outerDf); // 9
			System.out.println("this.outerDf = " + this.outerDf); // 9
			System.out.println(MemberOuter.this.outerDf); // 100
		}
	}

	public static void main(String[ ] args) {
		MemberOuter obj = new MemberOuter( ); // 객체 생성

		// 인스턴스 클래스 안의 메서드를 실행하기 위해
		MemberOuter.MemberInner t = obj.new MemberInner( ); // 객체 생성
		t.method( ); // 내부 메서드 호출하여 실행
	}
}