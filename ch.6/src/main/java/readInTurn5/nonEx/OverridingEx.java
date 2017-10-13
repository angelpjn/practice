package readInTurn5.nonEx;

class Human {
	public void move() {
		System.out.println("인간이 움직인다.");
	}
}

class Boy extends Human {
	public void move() {
		super.move();
		System.out.println("소년이 움직인다.");
	}
}

public class OverridingEx {
	public static void main(String[] args) {
		Human a = new Human();
		Human b = new Boy();
		Boy c = new Boy();
		
		a.move();
		b.move();
		c.move();
	}
}