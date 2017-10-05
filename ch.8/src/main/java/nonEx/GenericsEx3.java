
package nonEx;

class GenericsEx2<T> {
    private T content;

    public GenericsEx2(T content) {
        this.content = content;
    }

    public T getVar() {
        return this.content;
    }

    // public void setVar(T t1) {
    //     this.content = t1;
    // }

    // public String toString() {
    //     return content + " (" + content.getClass() + ")";
    // }

    public static <T> boolean isEqual(GenericsEx2<T> g1, GenericsEx2<T> g2) {
        return g1.getVar().equals(g2.getVar());
    }
}

public class GenericsEx3 {
    public static void main(String[] args) {

        GenericsEx2<String> g1 = new GenericsEx2<>("Vision");
        System.out.println(g1.getVar());
        GenericsEx2<String> g2 = new GenericsEx2<>("Act");
        System.out.println(g1.getVar());

        GenericsEx2<Integer> g3 = new GenericsEx2<Integer>(88);
        System.out.println(g3.getVar());
        GenericsEx2<Double> g4 = new GenericsEx2<Double>(8.14);
        System.out.println(g4.getVar());

        boolean isEqual = GenericsEx2.<String> isEqual(g1, g2);
        isEqual = GenericsEx2.isEqual(g1, g2);
        System.out.println(isEqual);
    }
}

