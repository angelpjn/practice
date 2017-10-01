
package nonEx;

class A {
    private int a = 50;

    class B {
        final static int SIZE = 100;
        int x = a;
    }
}

public class TestClass {
    public static void main(String[] args) {
        A obj = new A();

        A.B obj2;
        obj2 = obj.new B();
        System.out.println("SIZE = " + A.B.SIZE);

    }
}