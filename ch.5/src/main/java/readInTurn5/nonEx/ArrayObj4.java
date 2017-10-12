
package readInTurn5.nonEx;

class Flower3 {
	String type, color, arrangement;
	double unitPrice;
	
	public Flower3() {}
	
	public Flower3(String t, String c, String a, double p) {
		this.type = t;
		this.color = c;
		this.arrangement = a;
		this.unitPrice = p;
	}
	
	public String toString() {
		return ("꽃 종류 : " + type + "\t색깔 : " + color + "\t준비물 : "
	            + arrangement + "\t가격 : " + unitPrice + "\n");
	}
}

class ObjectArray {
	public ObjectArray() {
	}

	public /*static*/ Flower[] showInfo() {
		Flower[] f = new Flower [] { new Flower ("카네이션", "빨강", "항아리", 100.2),
									 new Flower ("장미", "노랑", "귀찮아", 55.12),
									 new Flower ("수국", "파랑", "꽃병", 60.54) };
		for (Flower e : f) {
			System.out.println(e);
		}
		
		return f;
	}
}
		
public class ArrayObj4 {
	public static void main(String[] args) {
		ObjectArray obj = new ObjectArray();
		Flower[] f = obj.showInfo();
//		ObjectArray.showInfo();
	}
}