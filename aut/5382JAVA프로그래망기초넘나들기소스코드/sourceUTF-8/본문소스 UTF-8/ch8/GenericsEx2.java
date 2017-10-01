class GenericsEx<T> {
	private T content;

	public GenericsEx(T content) {
		this.content = content;
	}

	public T getVar() {
		return this.content;
	}

	public void setVar(T t1) {
		this.content = t1;
	}

	public String toString() {
		return content + " (" + content.getClass() + ")";
	}

	public static <T> boolean isEqual(GenericsEx<T> g1, GenericsEx<T> g2) {
		return g1.getVar().equals(g2.getVar());
	}
}

public class GenericsEx2 {
	public static void main(String[] args) {

		GenericsEx<String> g1 = new GenericsEx<>("Vision");
		System.out.println(g1.getVar());
		GenericsEx<String> g2 = new GenericsEx<>("Act");
		System.out.println(g1.getVar());

		GenericsEx<Integer> g3 = new GenericsEx<Integer>(88);
		System.out.println(g3.getVar());
		GenericsEx<Double> g4 = new GenericsEx<Double>(8.14);
		System.out.println(g4.getVar());

		boolean isEqual = GenericsEx.<String> isEqual(g1, g2);
		isEqual = GenericsEx.isEqual(g1, g2);
		System.out.println(isEqual);
	}
}