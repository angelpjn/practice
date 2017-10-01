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
		System.out.println("음식을 만들다.");
	}

	public void taste( ) {
		System.out.println("너무 맛있네...");
	}

	public String toString( ) {
		return ("칼로리: " + calories + " 용량: " + fat + " grams.");
	}
}

public class E0509 {
	public static void main(String[ ] args) {
		Food food = new Food(80, 50.35);
		System.out.println(food);
	}
}