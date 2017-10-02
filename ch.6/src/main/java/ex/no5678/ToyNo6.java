
package ex.no5678;

class ToyNo6 extends Goods {
    int age;
    public ToyNo6() {}
    public ToyNo6(String name, int price, int age) {
        super(name, price);
        this.age = age;
    }

    public String toString() {
        return ("이름" + super.name + "\n가격" + super.price + "\n이용가능연령 : " + this.age);
    }
}