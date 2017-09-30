
package nonEx;

public class OverLoading {
    int age;

    public OverLoading(int age) {
        System.out.println("생성자 : " +age);
        this.age = age;
    }

    public void info(int a, int b) {
        System.out.println(a + b);
    }

    public void info(String s) {
        System.out.println("이름 : "+s);
    }

    public void info(double a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        OverLoading s = new OverLoading(35);

        s.info(3, 5);
        s.info("박정남");
        s.info(3.141592, 1234561);
    }
}