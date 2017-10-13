
package readInTurn4.nonEx;

interface Ia {
    public static final int c = 88;

    public abstract void method();
}

interface Ib {
    void method();
}

interface Ic extends Ia, Ib {
    public void method2();
}

class B4 {
    public String method4() {
        String strB4 = "B4의 method4";
        return strB4;
    }

    public String toString() {
        return "B4에서 오버라이딩한 메소드 구현";
    }
}

class C4 extends B4 implements Ic {
    public void method() {
        System.out.println("Ia에서 상속받은 메소드 구현");
    }

    public void method2() {
        System.out.println("C4의 method2 구현");
    }
    public void method3() {
        System.out.println("C4의 method3 구현");
    }
    public void method5() {
        System.out.println("C4의 method5 구현");
    }
}

class A4 implements Ic {
    public void method() {
        System.out.println("I can do it!");
    }

    public void method2() {}

    public void method3() {}
}

public class InterfaceEx3 {
    public static void main(String[] args) {
        A4 obj = new A4();
        obj.method();
        Ia ia = new C4();
        ia.method();
    }
}
