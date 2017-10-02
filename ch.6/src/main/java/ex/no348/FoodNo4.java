
package ex.no348;

class FoodNo4 extends GoodsNo3 {
    String groceries;

    public FoodNo4() {}

    public FoodNo4(String name, double price, String groceries) {
        super(name, price);
        this.groceries = groceries;
    }

    public String toString() {
        return ("이름 : " + super.name + "\n가격 : " + super.price + "원" + "\n식재료 : " + this.groceries);
    }
}