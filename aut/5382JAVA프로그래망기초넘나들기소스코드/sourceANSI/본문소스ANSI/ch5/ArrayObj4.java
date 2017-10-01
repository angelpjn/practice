class Flower {
	String type;
	String color;
	String arrangement;
	double unitPrice;

	public Flower( ) { }
	public Flower(String t, String c, String a, double p) {
		type = t;
		color = c;
		arrangement = a;
		unitPrice = p;
	}

	public String toString( ) { // 오버라이딩(재정의)한 출력 형식
		return "종류: " + type + ", 색상: " + color + ", 준비: " + arrangement
				+ ", 가격: " + unitPrice;
	}
}

class ObjectArray {
	public ObjectArray( ) {
	}

	// 리턴 타입 Flower[ ] 은 객체 배열
	public Flower[ ] showInfo( ) {
		Flower[ ] f = new Flower[3]; // 객체 배열 셍성
		f = new Flower[ ] { new Flower("카네이션", "빨강", "바구니", 100.37),
				new Flower("장미", "빨강", "화병", 200.29),
				new Flower("국화", "흰색", "꽃병", 300.15) };

		for (Flower e : f) { // 향상된 foreach 문
			System.out.println(e); // 전체 요소 출력
		}
		return f;
	}
}

public class ArrayObj4 {
	public static void main(String[ ] args) {
		ObjectArray obj = new ObjectArray( );
		Flower[ ] f = obj.showInfo( ); // 매서드 호출
	}
}