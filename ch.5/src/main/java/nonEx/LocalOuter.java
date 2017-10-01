
package nonEx;

public class LocalOuter {
    private int data = 50;
    final int Lv = 123;
    void method() {

        class LocalInner {
            void msg() {
                System.out.println("data = " + data);
                System.out.println("Lv = " + Lv);
            }
        }

        LocalInner local = new LocalInner();
        local.msg();
    }

    public static void main(String[] args) {
        LocalOuter obj = new LocalOuter();
        obj.method();
    }
}