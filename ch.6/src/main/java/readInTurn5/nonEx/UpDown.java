package readInTurn5.nonEx;

class Sub extends Object {
	void info() {
		System.out.println("서브 클래스");
	}

	public String toString() {
		return ("업캐스팅 된 것을 원래대로 다운 캐스팅");
	}
}

public class UpDown {

	public static void main(String[] args) {
		Object obj = new Sub();
		
		if (obj instanceof Sub) {
			Sub a = (Sub) obj;
			System.out.println("Sub : " + a);
		} else {
			System.out.println("타입이 일치하지 않음");
		}
	}

}
