
package ex.no10;

class Handphone implements Site {

    String type;
    int price;

    public Handphone() {}

    public Handphone(String type, int price) {
        this.type = "iPhone 166";
        this.price = 200000;
    }

    public void buy() {

        System.out.println("기종 : " + this.type + "\n가격 : " + this.price + "원");
    }
}

