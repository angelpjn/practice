
package nonEx;

public class LocalOuterEx {
    private int a = 50;
    final int Lv = 123;

    void method(final int a, int b) {
        int c = 30;
        final int d = 40;

        class LocalInnerEx {
            void msg() {
                int no = 0;
                no = no + 8;

                System.out.println("data = " + a);
                System.out.println(a);
                System.out.println("private이라 바로 사용 불가 -> " + LocalOuterEx.this.a);
                System.out.println("final이라 바로 사용 가능 -> " + Lv);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
            }
        }
        LocalInnerEx local = new LocalInnerEx();
        local.msg();
    }

    public static void main(String[] args) {
        LocalOuterEx obj = new LocalOuterEx();
        obj.method(5, 10);
    }
}