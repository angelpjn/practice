
package readInTurn5.nonEx;

public class LocalOuterEx {
	private int a = 50;
	final int LV = 123;
	
	void method(final int a, int b) {
		int c = 30;
		final int D = 40;
		
		class LocalInner {
			void msg() {
				int no = 0;
				no += 8;
				System.out.println("data = " + a);
				System.out.println(a);
				System.out.println(LocalOuterEx.this.a);
				System.out.println(no);
//				System.out.println(c);
				System.out.println(D);
			}
		}
		LocalInner local = new LocalInner();
		local.msg();
	}
	
	public static void main(String[] args) {
		LocalOuterEx obj = new LocalOuterEx();
		obj.method(5, 10);
	}
}