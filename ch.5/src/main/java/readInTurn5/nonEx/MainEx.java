
package readInTurn5.nonEx;

class MyException2 extends Exception {
	public MyException2(String msg) {
		super(msg);
	}
}

public class MainEx {
	static void studentAge(int age) throws MyException2 {
		if (age < 0)
			throw new MyException2("나이가 0보다 적을 수 없음!");
		else
			System.out.println("유효!");
	}
	public static void main(String[] args) {
		try {
			studentAge(-2);
		} catch (MyException2 e) {
			System.out.println("예외발생 : " + e.getMessage());
			e.printStackTrace();
		}
	}
}