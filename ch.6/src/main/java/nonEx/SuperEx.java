
package nonEx;

class A2 {
    int vi;
    String vs;

    public A2() {
        vi = 5;
        vs = "Java";
    }

    public A2(String vs) {
        this();
        this.vs = "I Can do it.";
    }

    public A2(int vi, String vs) {
        this(vs);
        this.vi = vi;
    }
}

class B2 extends A2 {
    int ve;

    public B2() {
        super();
        ve = 88;
    }

    public B2(String str) {
        super(str);
        ve = 77;
    }

    public B2(int x, String st) {
        super(x, st);
        ve = 33;
    }

    public B2(int x, String st, int y) {
        this(x, st);
        ve = y;
    }
}

public class SuperEx {
    public static void main(String[] args) {
        B2 object = new B2(1, "문자열", 1);
        System.out.println("멤버 ve = " + object.ve + object.vs);
    }
}