
package nonEx;

public class ConstructorEx{

    String name;
    int age;

    ConstructorEx(){}

    public String toString(){
            return "name : "+name+"\tage : "+age;
    }
    
    public static void main(String[] args){

        ConstructorEx c = new ConstructorEx();
        c.age = 20;
        c.name = "홍 길동";

        System.out.println(c);

    }
}