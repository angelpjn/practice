package readInTurn5.nonEx;

interface Fruit3 {
	public boolean hasPeel();
}

interface Vegetable {
	public boolean isVegetable();
}

public class Tomato implements Fruit3, Vegetable {
	
	boolean peel = false;
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
		if( tomato.hasPeel()) {
			System.out.println("껍질을 벗기다.");
		} else if (tomato.isVegetable()) {
			System.out.println("껍질을 벗길까?");
		} else {
			System.out.println("껍질을 안 벗기다.");
		}
	}
}