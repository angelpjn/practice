
package nonEx;

class Flower_2 {
    String type;
    String color;
    String arrangement;
    double unitPrice;

    public Flower_2(String t, String c, String a, double p) {
        type = t;
        color = c;
        arrangement = a;
        unitPrice = p;
    }

    public String toString() {
        return "이름 : " + type + ", 색깔 : " + color + ", 준비물 : " + arrangement + ", 가격 : " + unitPrice;
    }
}

class ObjectArray4 {
    public ObjectArray4() {

    }

    public static Flower_2[] showInfo() {
    // public Flower_2[] showInfo() {
        Flower_2[] f = new Flower_2[3];

        f = new Flower_2[] {new Flower_2("카네이션", "빨강", "바구니", 100.37),
                            new Flower_2("장미", "빨강", "화병", 200.29),
                            new Flower_2("국화", "흰색", "꽃병", 300.15) };

        for(Flower_2 e : f) {
            System.out.println(e);
        }
        return f;
    }
}

public class ArrayObj4 {
    public static void main(String[] args) {

        Flower_2[] f = ObjectArray4.showInfo();
        // ObjectArray4 obj = new ObjectArray4();
        // Flower_2[] f = obj.showInfo();
    }
}