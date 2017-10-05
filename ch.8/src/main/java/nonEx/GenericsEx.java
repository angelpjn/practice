
package nonEx;

class ClassName<T> {
    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;
    }
}

public class GenericsEx {
    public static void main(String[] args) {
        ClassName<String> obj = new ClassName<>();
        obj.set("Pankaj");
        ClassName obj2 = new ClassName();
        obj2.set("Pankaj");
        obj2.set(88);
    }
}