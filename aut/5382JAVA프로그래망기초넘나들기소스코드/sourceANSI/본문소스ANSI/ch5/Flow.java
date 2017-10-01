class Flow {
	String type;
	String color;
	String arrangement;
	double unitPrice;

	public Flow(String t, String c, String a, double p) {
		type = t;
		color = c;
		arrangement = a;
		unitPrice = p;
	}

	// Flower 객체를 매개변수로 전달하기, static 선언이니 객체 생성없이 직접 호출
	private static void showInfo(Flow[ ] f) {
		f = new Flow[ ] { new Flow("카네이션", "빨강", "바구니", 100.37),
				new Flow("장미", "빨강", "화병", 200.29),
				new Flow("국화", "흰색", "꽃병", 300.15) };

		for (Flow e : f) { // 향상된 foreach 문
			System.out.println(e); // 전체 요소 출력
		}
	}

	public String toString( ) { // 오버라이딩(재정의)한 출력 형식
		return "종류: " + type + ", 색상: " + color + ", 준비: " + arrangement
				+ ", 가격: " + unitPrice;
	}
	
	public static void main(String[ ] args) {
		Flow[ ] f = new Flow[3];
		showInfo(f); // static 선언한 메서드 직접 호출
	}
}