interface Fruit {
	public boolean hasPeel( ); // 반드시 서브 클래스에서 구현해야 함
}

interface Vegetable {
	public boolean isVegetable( ); // 반드시 서브 클래스에서 구현해야 함
}

public class Tomato implements Fruit, Vegetable {  // implements로 구현
	boolean peel = false;
	boolean vegetable = false;

	public Tomato( ) {  } // 기본 생성자, 빈 내용으로 구현	
	public boolean hasPeel( ) { // 인터페이스의 메서드 구현
		return peel;
	}
	public boolean isVegetable( ) { // 인터페이스의 메서드 구현
		return vegetable;
	}
	public static void main(String[ ] args) {
		Tomato tomato = new Tomato( );
		if (tomato.hasPeel( ))
			System.out.println("껍질을 벗기다.");
		else
			System.out.println("껍질을 안 벗기다.");
	}
}