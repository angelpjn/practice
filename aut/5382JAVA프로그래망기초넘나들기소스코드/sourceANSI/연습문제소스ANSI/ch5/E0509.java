class Food { 
	public double calories, fat;

	Food(double calories, double fat) {
		this.calories = calories;
		this.fat = fat;
	}

	public void clear( ) {
		this.calories = 0;
		this.fat = 0;
	}

	public void cook( ) {
		System.out.println("������ �����.");
	}

	public void taste( ) {
		System.out.println("�ʹ� ���ֳ�...");
	}

	public String toString( ) {
		return ("Į�θ�: " + calories + " �뷮: " + fat + " grams.");
	}
}

public class E0509 {
	public static void main(String[ ] args) {
		Food food = new Food(80, 50.35);
		System.out.println(food);
	}
}