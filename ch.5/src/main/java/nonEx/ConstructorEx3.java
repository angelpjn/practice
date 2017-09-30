
package nonEx;

public class ConstructorEx3 {
    String name;
    int age;

    ConstructorEx3() {
        this("이기자", 25);
    }

    ConstructorEx3(ConstructorEx3 c) {
        this("이기자", 25);
        name = c.name;
        age = c.age;
    }

    ConstructorEx3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "name : "+name+"\tage : "+age;
    }

    public static void main(String[] args) {
        ConstructorEx3 obj = new ConstructorEx3();
        ConstructorEx3 obj2 = new ConstructorEx3();
        obj2.name = "나변경";
        obj2.age = 22;
        ConstructorEx3 obj3 = new ConstructorEx3("홍길동", 20);

        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}