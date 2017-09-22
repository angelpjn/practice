interface Fruit{
    public boolean hasPeel();
}

interface Vegetable{
    public boolean isVegetable();
}

public class Tomato implements Fruit, Vegetable{
    boolean peel = true;
    boolean vegetable = false;

    public Tomato(){}

    public boolean hasPeel(){
        return peel;
    }

    public boolean isVegetable(){
        return vegetable;
    }

    public static void main(String[] args) {
        Tomato tomato = new Tomato();
        if(tomato.hasPeel())
            System.out.println("껍질을 벗기다.");

        else
            System.out.println("껍질을 안 벗기다.");
        
    }
}