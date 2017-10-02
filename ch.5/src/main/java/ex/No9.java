
package ex;

import java.util.Scanner;

class Food {
    
    String groceries;
    int calories;
    double fat;

    Food (String groceries, int calories, double fat) {
        this.groceries = groceries;
        this.calories = calories;
        this.fat = fat;
    }

    public void clear() {
        this.calories = 0;
        this.fat = 0;
    }

    public void cook() {

        if(this.calories < 100){
            System.out.println("조리가 간편함");
        }
        else {
            System.out.println("조리가 어려움");
        }
    }

    public void taste() {

        if(this.calories < 100) {
            System.out.println("맛 없쪙");
        }
        else {
            System.out.println("마시쪙");
        }
    }

    public String toString() {
        return "재료 : " + this.groceries + "\n칼로리 : " + this.calories 
               + "칼로리" + "\n지방 : " + this.fat;
    }

}

public class No9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("재료를 입력하세요! : ");
        String groceries = scan.next();

        System.out.print("칼로리는 얼마입니까? : ");
        int calories = scan.nextInt();

        System.out.print("지방은 얼마입니까? : ");
        double fat = scan.nextDouble();
        
        Food food = new Food(groceries, calories, fat);
        // Food food = new Food("야채", 50, 100.5);

        System.out.println(food);
        food.cook();
        food.taste();

    }
}