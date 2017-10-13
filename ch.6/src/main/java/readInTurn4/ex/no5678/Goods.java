
package readInTurn4.ex.no5678;

class Goods implements TaxableNo5 {
    String name;
    int price;
    double margin;
    double taxRate;
    int sell;

    public Goods() {}

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Goods(String name, int price, double margin, double taxRate, int sell) {
        this.name = name;
        this.price = price;
        this.margin = margin;
        this.taxRate = taxRate;
        this.sell = sell;
    }

    public double getIncome(double exemptionAmount){
        return this.price * this.margin * this.sell;

    }

    public double tax() {
        return this.price * this.taxRate * this.sell;

    }

    public void method() {

    }

    public String toString() {
        return ("이름 : " + this.name + "\n가격 : " + this.price + "\n이익 : " + this.margin);
    }

}
