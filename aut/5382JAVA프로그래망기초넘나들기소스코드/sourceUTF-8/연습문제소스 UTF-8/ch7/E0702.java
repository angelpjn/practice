interface Animal {
	public void eat( );
	public void work( );
}

class Mammal implements Animal {
	String kinds;

	Mammal(String kinds) {
		this.kinds = kinds;
	}

	public void eat( ) {
		System.out.println("먹는다.");
	}

	public void work( ) {
		System.out.println("일하다.");
	}
}

public class E0702 {
	public static void main(String args[ ]) {
		Mammal m = new Mammal("dog");
		m.eat( );
		m.work( );
	}
}