interface Box {
	public int area(int value);
}

interface Cube {
	public int volume(int value);
}

class Unit implements Box, Cube {
	public int area(int value) {
		return value;
	}

	public int volume(int value) {
		return value;
	}
}

public class E0611 {
	public static void main(String[ ] args) {

		Unit unit = new Unit( );
		System.out.println("�ڽ� ���� = " + unit.area(88));
		System.out.println("������ü ���� = " + unit.volume(100));
	}
}