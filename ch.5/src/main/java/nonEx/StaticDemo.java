
package nonEx;

class MyClass {
    private static int iv = 0;
 
    void increment() {
        MyClass.iv = 10;
        iv++;
    }

    // public static String info() {
    //     return ("iv = " + iv);
    // }

    public String toString() {
        return ("iv = " + iv);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        // MyClass.info();
        MyClass a = new MyClass();
        a.increment();
        System.out.println(a);
    }

}