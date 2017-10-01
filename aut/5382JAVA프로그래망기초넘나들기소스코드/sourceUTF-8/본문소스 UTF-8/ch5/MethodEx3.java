public class MethodEx3 {
	String name;

	public String setName(String name) { // new 통해 객체 생성해야 사용 가능
		return name;
	}

	public void showMessage( ) { // new 통해 객체 생성해야 사용 가능
		System.out.println("Java");
	}

	// static 없으면 객체 생성해야하지만, 존재: 객체 생성없이 직접 사용 가능
	public static void showMessage(String str) { // str 은 매개변수
		System.out.println(str); // 매개변수는 지역 변수로 동작
	}

	public static void main(String[ ] args) {
		showMessage("I can do it."); // 직접 사용, str 인수에 문자열 전달

		MethodEx3 obj = new MethodEx3( ); // showMessage( ) 사용하기 위해
		obj.showMessage( ); // new 통해 객체 생성 후 "객체명.메서드" 로 호출
		String name = obj.setName("홍 길동");
		System.out.println("이름: " + name);
	}
}