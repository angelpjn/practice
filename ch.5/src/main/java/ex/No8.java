
package ex;

class Dog {
    String name;
    String breed;
    int age;

    Dog(String n, String b, int a) {
        this.name = n;
        this.breed = b;
        this.age = a;
    }

    public String toString() {
        return "이름 : " + name + "\t견종 : " + breed + "\t나이 : " + age + "살";
    }
}

public class No8 {
    public static void main(String[] args) {
        Dog dog = new Dog("봄이", "몰라", 1);
        System.out.println(dog);

    }
}