
package readInTurn5.ex.no9;

class FoodInfo {
	String name;
	double calories;
	String fat;
	
	public FoodInfo() {}
	public FoodInfo(String name, double cal, String fat) {
		this.name = name;
		this.calories = cal;
		this.fat = fat;
	}
	
	public void clear() {
		System.out.println(name + "먹고싶다.");
	}
	public static void cook() {
		System.out.println("이 음식은 치킨집에서 만든다!");
	}
	void taste() {
		System.out.println(name + "은 맛있음.");
	}
	
	public String toString() {
		return ("음식명 : " + name + "\n칼로리 : " + calories + " calories" + "\n지방질 : " + fat);
	}
	
	
}