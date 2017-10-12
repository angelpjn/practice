
package readInTurn5.nonEx;

class MyClass {
	private static int iv = 0;
	
	void increment() {
		MyClass.iv = 10;
		iv++;
	}
	
	public static void setInfo() {
		iv += 1;
	}
	
	public static void info() {

		System.out.println("iv = " + iv);
	}
	
	public String toString() {
		return ("iv = " + iv);
	}
	
}

public class StaticDemo {
	public static void main(String[] args) {
		MyClass.setInfo();
		MyClass.setInfo();
		MyClass.setInfo();
		MyClass.setInfo();
		MyClass.info();
		MyClass.setInfo();
		MyClass.info();
		
//		MyClass a = new MyClass();
//		a.increment();
//		System.out.println(a);
	}
}