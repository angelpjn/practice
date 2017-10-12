
package readInTurn5.nonEx;

public class OverLoading {
	int age;
	
	public OverLoading(int age) {
		System.out.println("생성자 : " + age);
		this.age = age;
	}
	
	public OverLoading(int a, int b) {
		System.out.println(a + b);
	}
	
	public void info(double a, int b) {
		System.out.println(a + b);
	}
	
	public void info(String s) {
		System.out.println(s + " 문자열 : " + s);
	}
	
	public static void main(String[] args) {
		OverLoading s = new OverLoading(20);
		s.info(3, 5);
		s.info("LOVE");
		s.info(2.3, 6);
	}
}