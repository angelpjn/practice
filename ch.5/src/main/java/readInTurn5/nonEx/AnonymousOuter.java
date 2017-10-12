
package readInTurn5.nonEx;

class AnonymousClass {
	public void method() {
		System.out.println("method()");
	}
}

public class AnonymousOuter {
	public static void main(String[] args) {
		AnonymousClass ac = new AnonymousClass() {
			public void method() {
				System.out.println("method() 오버라이딩(재정의)");
			}
		};
		ac.method();
	}
}
