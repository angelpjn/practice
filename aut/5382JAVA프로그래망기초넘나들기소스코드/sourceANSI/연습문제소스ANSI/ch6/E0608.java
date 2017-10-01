class Goods {
	String name; // 상품명
	double price; // 가격	

	public Goods(String name, double price) {
		this.name = name;
		this.price = price;		
	}

	public String toString( ) {
		return ("상품명: " + name + " 가격: " + price );
	}

	public void display( ) {
		System.out.println("상품명: " + name + " 가격: " + price );
	}
}

class Food extends Goods {
	private double calories; // Kcal

	public Food(String name, double pr, double cal) {
		super(name, pr);
		calories = cal;
	}

	public void display( ) {
		super.display( );
		System.out.println("\t\t칼로리: " + calories);
	}
}

interface Taxable {
	final double taxRate = 0.03;
        public double getIncome(double exemptionAmount); // 면세
	public double tax( );
}

class Toy extends Goods implements Taxable {
	private String material;

	public Toy(String name, double pr, String m) {
		super(name, pr);
		material = m;
	}

	public void display( ) {
		super.display( );
		System.out.println("제품소재: " + material);
	}


	public double tax( ) {
		return price * taxRate;
	}
}

class Book extends Goods implements Taxable {
	private String author;

	public Book(String des, double pr, String auth) {
		super(des, pr);
		author = auth;
	}

	public void display( ) {
		super.display( );
		System.out.println("저자: " + author);
	}

	public double tax( ) {
		return price * taxRate;
	}
}

public class E0608 {
	public static void main(String[ ] args) {
		Food food = new Food("돌솥비빔밥", 7000, 628.5);
		Taxable book = new Book("Java", 25000, "홍길동");
		Taxable toy = new Toy("Legos", 54.45, "플라스틱");

		food.display( );
		System.out.println("세금: " + book.tax( ));
		System.out.println("부가가치세: " + toy.tax( ));
	}
}