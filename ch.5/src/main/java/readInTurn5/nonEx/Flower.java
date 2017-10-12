
package readInTurn5.nonEx;

public class Flower {
	String type, color, arrangement;
	double unitPrice;
	
	public Flower(String t, String c, String a, double p) {
		this.type = t;
		this.color = c;
		this.arrangement = a;
		this.unitPrice = p;
	}
	
	public String toString() {
		return ("이름 : " + type + "\t색깔 : " + color + "\t준비물 : " + arrangement + "\t가격 : " + unitPrice + "\n");
		
	}
	public static void main(String[] args) {
		Flower[] f = new Flower[3];
		
		f[0] = new Flower("카네이션", "빨강", "바구니", 100.37);
		f[1] = new Flower("장미", "노랑", "꽃병", 200.27);
		f[2] = new Flower("광식이", "흰색", "항아리", 10000.37);
		
		for (int i = 0; i < f.length; i++) {
			System.out.print(f[i]);
		}
		System.out.println();

	}
}