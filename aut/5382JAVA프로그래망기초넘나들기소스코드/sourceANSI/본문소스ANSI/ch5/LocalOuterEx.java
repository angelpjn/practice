public class LocalOuterEx {
	private int a = 50;
	final int Lv = 123; // final이 붙은 변수는 상수, 참조 가능해 짐

	void method(final int a, int b) {
		int c = 30;       // 필드(멤버 변수)
		final int d = 40; // 필드(멤버 변수)
		 
	    // LocalInner 클래스는 method( ) 메서드 내에서만 사용 가능
		class LocalInner { // 지역 클래스, 메서드 안에서 선언
			void msg( ) {
				int no = 0;  // 지역 변수는 반드시 초기화해야만 사용 가능
				no = no + 8;
				System.out.println("data = " + a);
				/* outer method의 지역변수나 매개변수 중에 final만 접근 가능 */
				// d = 3; // 컴파일 오류, final 변수의 값은 변경 불가
				System.out.println(a); // 가능
				System.out.println(LocalOuter.this.a); // 가능
				System.out.println(b); // 컴파일 오류
				System.out.println(c);
				// └ 컴파일 오류: final 안 붙은 지역변수나 파라미터는 접근 불가
				System.out.println(d); // 가능
			}
		}
		LocalInner local = new LocalInner( ); // 클래스로 부터 객체 생성 후
		local.msg( ); // 메서드를 호출하여 사용
	}

	public static void main(String args[ ]) {
		LocalOuter obj = new LocalOuter( );
		obj.method(5, 10);
	}
}