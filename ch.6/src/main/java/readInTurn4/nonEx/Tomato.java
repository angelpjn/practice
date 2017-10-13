
package readInTurn4.nonEx;

interface Fruit3 {
    public boolean hasPeel();
}

interface Vegetable {
    public boolean isVegetable();
}

public class Tomato implements Fruit3, Vegetable {
    boolean peel = true;
    boolean vegetable = true;

    public Tomato() {}

    public boolean hasPeel() {
        return peel;
    }

    public boolean isVegetable() {
        return vegetable;
    }

    public static void main(String[] args) {
        Tomato tomato = new Tomato();
        // if(tomato.hasPeel())
        if(tomato.isVegetable())
            System.out.println("껍질을 벗기다.");
        else
            System.out.println("껍질을 안벗기다.");
    }
}