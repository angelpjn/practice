
package ex.no348;

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        FoodNo4 food = new FoodNo4();

        System.out.print("상점명 : ");
        food.name = scan.next();
        System.out.print("가격 : ");
        food.price = scan.nextDouble();
        System.out.print("식료품 : ");
        food.groceries = scan.next();

        System.out.println();

        System.out.println(food);
    }
}