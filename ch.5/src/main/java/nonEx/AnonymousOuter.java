
package nonEx;

class anonymousClass {
    public void method() {
        System.out.println("method() 원본");
    }
}

public class AnonymousOuter {
    public static void main(String[] args) {
        anonymousClass ac = new anonymousClass() {
            public void method() {
                System.out.println("method() 오버라이딩(재정의)");
            }
        };
        ac.method();
    }
}