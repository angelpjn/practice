class Sub extends Object {
	void info( ) {
		System.out.println("서브 클래스");
	}

	public String toString( ) { // toString 오버라이딩: 객체 출력용
		return ("업캐스팅된 것을 원래대로 다운캐스팅");
	}
}

public class UpDown {
	public static void main(String[ ] args) {
		// (슈퍼클래스 < 서브클래스)이므로 명시적 형변환을 하지 않아도
		Object obj = new Sub( ); // 업캐스팅, 자동으로 형변환
		if (obj instanceof Sub) { // 타입 확인
			Sub a = (Sub) obj; // 업캐스팅된것을 원래대로 다운캐스팅
			System.out.println("Sub: " + a);
		} else {
			System.out.println("타입이 일치하지 않음");
		}
	}
}