public class StaticOuter {
	private int outerM = 0;
	// int siv = outerM; // 외부클래스의 인스턴스 멤버에 접근 불가
	private static int outerDf = 0;

	// 메모리 상에 이미 로딩되어 올라갔기에 객체 생성없이 직접 사용
	public static class StaticInner {
		private int innerMember = 20;
		private static int outerDf = 3; // 외부의 outerDf은 숨겨짐
		final int Lv = 123; // final이 붙은 변수는 상수

		public static void nestedM( ) {
			// System.out.println(innerMember); // 오류, static -> non-static
			// System.out.println(outerM); // 오류
			// System.out.println(StaticInner.innerMember); // 오류
		}

		// 외부메서드에서도 내부클래스의 멤버에 접근할 수 있음
		// 같은 클래스처럼 인식하므로 private 속성은 무시됨
		public void method( ) {
			System.out.println("outerDf = " + outerDf); // private 속성 무시,3
			System.out.println("this.outerDf = " + this.outerDf); // 3
			// StaticOuter.StaticInner.outerDf; // //private 이므로 접근 불가
			// Lv = 100; // Lv는 상수이므로 대입 불가
			System.out.println("Lv = " + Lv); // 123
			// System.out.println(StaticOuter.this.outerM); // 접근 불가
		}
	}

	public static void main(String[ ] args) {
		// static 클래스의 객체 생성하지 않고 직접 호출
		StaticOuter.StaticInner obj = new StaticOuter.StaticInner( );
		obj.method( ); // 메서드 호출하여 실행
		System.out.println(StaticOuter.StaticInner.outerDf);
	}
}