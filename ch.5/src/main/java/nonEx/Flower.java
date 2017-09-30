
package nonEx;

public class Flower {
    String type;
    String color;
    String arrangement;
    double unitPrice;

    public Flower(String t, String c, String a, double p) {
        type = t;
        color = c;
        arrangement = a;
        unitPrice = p;

    }

    public String toString(){
        return "이름 : " + type + ", 색상 : " + color + ", 준비 : " + arrangement + ", 가격 : " + unitPrice;
    }

    public static void main(String[] args) {
        Flower [] f = new Flower[3];

        f[0] = new Flower("카네이션", "빨강", "바구니", 100.37);
        f[1] = new Flower("장미", "빨강", "화병", 200.29);
        f[2] = new Flower("국화", "흰색", "꽃병", 300.15);

        for(int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }
    }
}