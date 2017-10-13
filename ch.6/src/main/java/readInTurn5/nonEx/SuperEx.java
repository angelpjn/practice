package readInTurn5.nonEx;

class A {
	int vi;
	String vs;
	
	public A() {
		vi = 5;
		vs = "Java";
	}
	
	public A(String vs) {
		this();
		this.vs = "I Can do it.";
	}
	
	public A(int vi, String vs) {
		this(vs);
		this.vi = vi;
	}
}

class B extends A {
	int ve;
	
	public B() {
		super();
		ve = 88;
	}
	
	public B (String str) {
		super(str);
		ve = 77;
	}
	
	public B(int x, String st) {
		super(x, st);
		ve = 33;
	}
	
	public B(int x, String st, int y) {
		this(x, st);
		ve = y;
	}
}

public class SuperEx {

	public static void main(String[] args) {
		
		A obj = new A("ddd");
		System.out.println("vs = " + obj.vs);
		
		
		B object = new B();
		System.out.println("멤버 ve = " + object.ve);
		B object2 = new B("f");
		System.out.println("멤버 ve = " + object2.ve);
		B object3 = new B(1, "zz");
		System.out.println("멤버 ve = " + object3.ve);
		B object4 = new B(14123, "xxx", 23);
		System.out.println("멤버 ve = " + object4.ve);
	}

}
