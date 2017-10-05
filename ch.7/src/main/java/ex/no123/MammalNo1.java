
package ex.no123;

class MammalNo1 implements Animal {

    int eatAmount;
    double move;
    String size, type;

    public MammalNo1() {}

    public MammalNo1(int eatAmount, double move, String size, String type) {
        this.eatAmount = eatAmount;
        this.move = move;
        this.size = size;
        this.type = type;
    }

    public String toString() {
        return "\n\n이 동물은 " + this.type + "입니다.\n" + this.type + "은 " + this.size + "포유류로써\n";
    }
    public void eat() {
        System.out.println("하루에 " + this.move + "Kg의 먹이를 먹습니다.");
    }
    public void work() {
        System.out.println("그러나 사냥을 위해서는 하루에 약 " + this.move + "Km의 거리를 움직여야 합니다.");        
    }
}
