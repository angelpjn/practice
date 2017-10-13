
package readInTurn4.nonEx.inheritanceDemo;

public class InheritanceDemo {
    public static void main(String[] args) {
        Fruit f = new Fruit();
        f.fruiter();

        Apple a = new Apple();
        a.setFlavor("Sweet");
        System.out.println("사과 맛 : " + a.getFlavor());
    }
}