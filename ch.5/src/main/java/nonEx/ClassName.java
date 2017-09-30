
package nonEx;

public class ClassName {

    String name;

    public void setName(String n) {
        name = n;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        ClassName object = new ClassName();

        object.setName("박정남");

        System.out.println("신규 수강생 이름 : "+object.getName());
    }
}