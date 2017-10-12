
package readInTurn5.nonEx;

class Flower2 {
	String type, color, arrangement;
	double unitPrice;
	
	public Flower2(String t, String c, String a, double p) {
		this.type = t;
		this.color = c;
		this.arrangement = a;
		this.unitPrice = p;
	}
	
	private static void showInfo(Flower2 [] f) {
		f = new Flower2 [] { new Flower2 ("카네이션", "빨강", "항아리", 100.2),
							 new Flower2 ("장미", "노랑", "귀찮아", 1000.12),
							 new Flower2 ("수국", "파랑", "꽃병", 60.54) };
		for (Flower2 e : f) {
			System.out.println(e);
		}
		
	}
	
	public String toString() {
		return ("꽃 종류 : " + type + "\t색깔 : " + color + "\t준비물 : "
	            + arrangement + "\t가격 : " + unitPrice + "\n");
	}
	
	public static void main(String[] args) {
		Flower2 [] f = new Flower2[3];
		showInfo(f);
	}
}