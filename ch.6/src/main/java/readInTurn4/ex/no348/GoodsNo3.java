
package readInTurn4.ex.no348;

class GoodsNo3 {
    protected String name;
    protected double price;

    public GoodsNo3() {}

    public GoodsNo3(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return ("이름 : " + this.name + "\n가격" + this.price);
    }
}