public class LocalOuter {
	private int data = 50;
	final int Lv = 123; // final이 붙은 변수는 상수, 참조 가능해 짐
	void method( ) {
		// LocalInner 클래스는 method( ) 메서드 내에서만 사용 가능
		class LocalInner { // 지역 클래스, 메서드 안에서 선언된 임시 클래스이므로
			void msg( ) {
				System.out.println("data = " + data);
			}
		}
		// 지역 클래스가 선언된 메서드 안에서 객체를 생성해야만 함에 주목
		LocalInner local = new LocalInner( ); // 객체 생성 후
		local.msg( ); // 메서드를 호출하여 사용
	}

	public static void main(String args[ ]) {
		LocalOuter obj = new LocalOuter( );
		obj.method( );
	}
}