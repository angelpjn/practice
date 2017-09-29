
package nonEx;

public class ClassName{

    private String name;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args){
        ClassName object = new ClassName();
        object.setName("수강생");
        System.out.println("안녕하세요! "+object.getName());
    }
}