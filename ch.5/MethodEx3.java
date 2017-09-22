public class MethodEx3{

    String name;

    public String setName(String name){
        return name;
    }
    
    public void showMessage(){
        System.out.println("Java");
    }

    public static void showMessage(String str){
        System.out.println(str);
    }
    public static void main(String[] args){
        showMessage("I can do it.");

        MethodEx3 obj = new MethodEx3();
        obj.showMessage();
        String name = obj.setName("홍길동");
        System.out.println();
        System.out.println("이름 : "+name);
    }
}