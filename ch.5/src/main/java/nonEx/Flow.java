
package nonEx;

public class Flow {
    String type;
    String color;
    String arrangement;
    double unitPrice;

    public Flow(String t, String c, String a, double p) {
        type = t;
        color = c;
        arrangement = a;
        unitPrice = p;
    }

    private static void showInfo(Flow[] f) {
        f = new Flow[] { new Flow("카네이션", "빨강", "바구니", 100.37),
                         new Flow("장미", "빨강", "화병", 200.29),
                         new Flow("국화", "흰색", "꽃병", 300.15) };

        for(Flow e : f) {
            System.out.println(e);
        }
    }

    public String toString() {
        return "종류 : " + type + ", 색상 : " + color + ", 준비 : " + arrangement + "가격 : " + unitPrice;
    }

    public static void main(String[] args) {
        Flow[] f = new Flow[3];
        showInfo(f);
    }
}