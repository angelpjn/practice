package animals; 
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
		System.out.println("�Դ´�.");
	}

	public void work( ) {
		System.out.println("���ϴ�.");
	}
}

public class E0703 {
	public static void main(String args[ ]) {
		Mammal m = new Mammal("dog");
		m.eat( );
		m.work( );
	}
}