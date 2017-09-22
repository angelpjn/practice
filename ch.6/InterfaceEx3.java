interface Ia{
    public static final int c = 88;

    public abstract void method();
}

interface Ib{
    void method();
}

interface Ic extends Ia, Ib{
    public void method2();
}

class B{
    public String method4(){
        String strB = "B의 method4";
        return strB;
    }

    public String toString(){
        return "B에서 오버라이딩한 메소드 구현"; 
    }
}

class C extends B implements Ic{
    public void method(){};
    public void method2(){System.out.println("C의 method2 구현");
}

public void method3(){};
public void method5(){System.out.println("C의 method5 구현");}
}

class A implements Ic{
    public void method(){
        System.out.println("I can do it!");
    }

    public void method2(){};
    public void method3(){};
}

public class InterfaceEx3{
    public static void main(String[] args){
        A obj = new A();
        Ia ia = new C();
    }
}