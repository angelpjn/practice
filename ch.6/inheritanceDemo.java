class Fruit{
    protected String name;

    public void fruiter(){
        System.out.println("과일 나무");
    }
}

// class Apple {
class Apple extends Fruit{
        
    private String flavor;


    public String getFlavor(){
        return flavor;
    }

    void setFlavor(String flavor){
        this.flavor = flavor;
    }
}

public class InheritanceDemo{
    public static void main(String[] args){
        Fruit f = new Fruit();
        f.fruiter();

        Apple a = new Apple();

        a.setFlavor("sweet");
        System.out.println("사과 맛 : "+a.getFlavor());
    }
}