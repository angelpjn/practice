// 1. 사용자 Exception 정의하기, 사용자 정의 루틴 Exception 에서 상속 
// 오류 발생시 출력 메시지 등을 생성자를 통해 인자로 받아 객체를 생성
class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}

	public String getMessage( ) {
		return super.getMessage( );
	}
}

// 2. 사용자 정의 Exception 던지기
// Exception 발생시 해당 상황 정보를 인자로 담아 Exception을 생성하여 던진다.
public class MainEx {
	static void studentAge(int age) throws MyException {
		if (age < 0)
			throw new MyException("나이가 0 보다 적을 수 없음!");
		else
			System.out.println("유효!");
	}

	public static void main(String[ ] args) {
		try {
			studentAge(-2);
		} catch (MyException e) { // 사용자 정의 오류 루틴 호출
			System.out.println("예외발생: " + e.getMessage( ));
			e.printStackTrace( );
		}
	}
}