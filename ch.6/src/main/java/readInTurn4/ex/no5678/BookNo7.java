
package readInTurn4.ex.no5678;

class BookNo7 extends Goods {
    String title, publisher;

    BookNo7() {}
    BookNo7(String name, int price, double margin, double taxRate, int sell, String title, String publisher) {
        super(name, price, margin, taxRate, sell);
        this.title = title;
        this.publisher = publisher;
    }

    public double getIncome(double exemptionAmount){
        return super.price * super.margin * super.sell;

    }

    public double tax() {
        return super.price * super.taxRate * super.sell;

    }

    public String toString() {
        double total = super.price * super.margin * super.sell;
        return ("저자 : " + super.name + "\n도서명 : " + this.title + "\n가격 : " + super.price + "원" + "\n판매 부수 : " + super.sell + "\n총 이익 : " + total + "원"  + "\n출판사 : " + this.publisher);
    }

}