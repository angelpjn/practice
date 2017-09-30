
package nonEx;

enum AnimalCategory {
    DOG, CAT, LION, TIGER, ELEPHANT
}

class Animal {
    AnimalCategory type;
    String size;

    public void initInfo() {
        this.type = AnimalCategory.DOG;
        this.size = "귀엽고 작다.";
    }

    public void showInfo() {
        System.out.println("동물 이름 : " + type);
        System.out.println("크기 : " + size);
    }
}

public class EnumClass {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.initInfo();
        obj.showInfo();
    }
}