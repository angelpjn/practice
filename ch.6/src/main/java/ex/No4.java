
package ex;

import java.util.Scanner;

class Food extends Goods {

    Food(String name, int price) {
        super(name, price);
    }

    public String toString() {
        return ("\n상품명 : " + this.name + "\n가격 : " + this.price);
    }
}

public class No4 {
    public static void main(String[] args) {

        String name;
        int price;

        Scanner scan = new Scanner(System.in);

        System.out.print("상품명 : ");
        name = scan.next();
        System.out.print("가격 : ");
        price = scan.nextInt();

        Goods goods = new Goods(name, price);
        System.out.println(goods);
    }
}

