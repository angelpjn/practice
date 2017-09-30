
package nonEx;

public class Add {
    public void add(int x, int y) {
        System.out.println("합계 = " +(x = y));
    }

    public static void main(String[] args) {
        Add a = new Add();
        a.add(3, 5);
    }
}