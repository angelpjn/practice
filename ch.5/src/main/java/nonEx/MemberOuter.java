
package nonEx;

public class MemberOuter {
    private int outerDf = 0;
    private static int si = 55;
    int c = 77;

    void outerMethod() {
        System.out.println(c);
        System.out.println(outerDf);
        System.out.println(this.si);
        MemberInner mi = new MemberInner();
        System.out.println("MemberInner() 호출 : " + mi.x);
    }

    static void outerSt() {
    }

    public class MemberInner {
        private int x = 33;
        int outerDf = 9;
        static final int b2 = 22;

        public void method() {
            int vm = si;
            System.out.println("MemberOuter의 값 대입, vm = " + vm);
            outerSt();
            MemberOuter obj = new MemberOuter();
            System.out.println(obj.si);
            System.out.println(this.x);

            MemberOuter.this.outerDf = 100;
            outerMethod();
            System.out.println("outerDf = " + outerDf);
            System.out.println("this.outerDf = " + this.outerDf);
            System.out.println("MemberOuter.this.outerDf = " + MemberOuter.this.outerDf);
        }
    }

    public static void main(String[] args) {
        MemberOuter obj = new MemberOuter();

        MemberOuter.MemberInner t = obj.new MemberInner();
        t.method();
    }
}