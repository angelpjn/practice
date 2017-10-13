package readInTurn5.nonEx;

abstract class A3 {
	public abstract String methodT();
	
	public void methodF() {
		System.out.println("Java");
	}
}

class B3 extends A3 {
	public String methodT() {
		return "I can do it.";
	}
}

public class AbstractEx {
	public static void main(String[] args) {
//		A3 obj = new A3();  => 추상클래스 A3 레퍼런스 생성 불가
		B3 obj2 = new B3();
		System.out.println(obj2.methodT());
	}
}