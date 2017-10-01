public class Counter {
	private int x; // 필드(멤버 변수)

	// 생성자, 메서드 이름이 클래스이름과 동일하므로
	public Counter(int x) { // x는 매개변수
		this.x = x; // 멤버변수는 this.멤버변수
	}

	public static void increment(Counter n) {
		n.x++;
	}

	// toString 메서드는 객체가 가지고 있는 값을 문자열로 만들어서 리턴
	// 출력 형태를 갖추려면 toString을 반드시 오버라이딩 해야 함
	public String toString( ) { // toString을 오버라이드 하는 부분
		return "메서드 호출 <전>: " + x; // 정의된 형태를 반환
	}
}

class CallByReference {
	public static void main(String[ ] args) {
		Counter c = new Counter(3); // 객체 생성, 자동으로 생성자 호출
		System.out.println("메서드 호출 <전>: " + c);
		Counter.increment(c); // 객체 전달하여 멤버 변수의 값 변경
		System.out.println("메서드 호출 <후>: " + c);
	}
}