public class ClassName {
	private String name; // 필드(멤버변수), 비공개(private)로 캡슐화

	public void setName(String n) { // 매개변수 있는 메서드
		name = n; // 필드 name에 매개변수 n의 값을 대입
	}

	public String getName( ) { // 매개변수 없는 메서드
		return name; // 종료, 호출한 메서드로 name 값을 전달
	}

	// 자바 프로그램 시작은 main( ) 를 호출해서 실행
	public static void main(String args[ ]) {
		ClassName object = new ClassName( ); // 객체 생성
		object.setName("수강생"); // 메서드 호출, 인수를 n에 전달
		System.out.println("안녕하세요! " + object.getName( ));
	}
}