
package nonEx;

public class Counter {

    private int x;

    public Counter(int x){
        this.x = x;
    }

    public static void increment(Counter n){
        n.x++;
    }

    public String toString(){
        return "메소드 호출 <전> : " +x;
    }
}

class CallByReference {
    public static void main(String[] args){
        Counter c = new Counter(3);
        System.out.println("메소드 호출 <전> : "+c);
        Counter.increment(c);
        System.out.println("메소드 호출 <후> : "+c);
    }
}

