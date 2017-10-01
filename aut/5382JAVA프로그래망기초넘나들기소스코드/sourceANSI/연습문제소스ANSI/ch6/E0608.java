class Goods {
	String name; // ��ǰ��
	double price; // ����	

	public Goods(String name, double price) {
		this.name = name;
		this.price = price;		
	}

	public String toString( ) {
		return ("��ǰ��: " + name + " ����: " + price );
	}

	public void display( ) {
		System.out.println("��ǰ��: " + name + " ����: " + price );
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
		System.out.println("\t\tĮ�θ�: " + calories);
	}
}

interface Taxable {
	final double taxRate = 0.03;
        public double getIncome(double exemptionAmount); // �鼼
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
		System.out.println("��ǰ����: " + material);
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
		System.out.println("����: " + author);
	}

	public double tax( ) {
		return price * taxRate;
	}
}

public class E0608 {
	public static void main(String[ ] args) {
		Food food = new Food("���ܺ����", 7000, 628.5);
		Taxable book = new Book("Java", 25000, "ȫ�浿");
		Taxable toy = new Toy("Legos", 54.45, "�ö�ƽ");

		food.display( );
		System.out.println("����: " + book.tax( ));
		System.out.println("�ΰ���ġ��: " + toy.tax( ));
	}
}