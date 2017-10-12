
package readInTurn5.ex.no9;

import java.util.Scanner;

public class Food {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		FoodInfo food = new FoodInfo();
		food.name = scan.next();
		food.calories = 200.55;
		food.fat = "지방질이 풍부함";
		
		System.out.println(food);
		food.taste();
		FoodInfo.cook();
		food.clear();
		
		scan.close();
	}
	
}
