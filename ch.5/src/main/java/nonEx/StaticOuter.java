
package nonEx;

public class StaticOuter {
    private int outerM = 0;
    private static int outerDf = 0;

    public static class StaticInner {
        private int innerMember = 20;
        private static int outerDf = 3;
        final int Lv = 123;

        public static void nestedM() {
        }

        public void method() {
            System.out.println("outerDf = " + outerDf);
            System.out.println("this.outerDf = " + this.outerDf);
            System.out.println("Lv = " + Lv);
        }
    }

    public static void main(String[] args) {
        StaticOuter.StaticInner obj = new StaticOuter.StaticInner();
        // obj.method();
        System.out.println(StaticOuter.StaticInner.outerDf);
        // System.out.println();
    }
}