
package readInTurn4.nonEx;

abstract class A3 {
    public abstract String methodT();

    public void methodF() {
        System.out.println("JAVA");
    }
}

class B3 extends A3 {

    public String methodT() {
        return "I can do it";
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        B3 obj = new B3();
        System.out.println(obj.methodT());
    }
}