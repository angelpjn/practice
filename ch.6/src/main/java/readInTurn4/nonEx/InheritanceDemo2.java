
package readInTurn4.nonEx;

class Fruit {
    protected String name;

    protected Fruit() {
        System.out.println("과일");
    }

    public Fruit(String name) {
        this.name = name;
    }

    public void fruiter() {
        System.out.println("과수");
    }
}

class Apple extends Fruit {
    private String flavor;

    public Apple(String name, String flavor) {
        super(name);
        this.flavor = flavor;
    }

    public void fruiter() {
        System.out.println("사과 나무");
    }

    public String toString() {
        return ("품종 : " + name + "\n맛 : " + flavor);
    }
}

public class InheritanceDemo2 {
    public static void main(String[] args) {
        // Fruit f = new Fruit("과일 나무");
        Fruit f = new Fruit();
        f.fruiter();

        Apple a = new Apple("사과(홍옥)", "상큼한 맛");
        a.fruiter();
        System.out.println(a);
    }
}