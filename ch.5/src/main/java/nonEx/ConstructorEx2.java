
package nonEx;

public class ConstructorEx2 {
    String name;
    int age;

    ConstructorEx2(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "name = "+name+"age = "+age;
    }

    public static void main(String[] args) {
        ConstructorEx2 object = new ConstructorEx2("홍길동", 20);
        System.out.println(object);
    }               


}