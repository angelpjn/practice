

// class 명 ObjecArray2가 ObjectArray가 되는 순간 모든 클래스는 각각의 클래스명.class 파일을 갖기 떄문에 duplicate class 컴파일 에러가 발생하며, 이로 인해 해당 public class 내의 ObjectArray2 클래스의 레퍼런스 객체인 obj를 찾지 못하는 식별자 오류 cannot find symbol 컴파일 오류가 발생하게 된다.

package nonEx;

class ObjectArray2 {
    private int[] prices;

    public int[] initInfo() {
        prices = new int[] {3, 5, -7};
        return prices;
    }
}

public class ArrayObj2 {
    public static void main(String[] args) {
        ObjectArray2 obj = new ObjectArray2();
        int[] ar = new int[4];

        ar = obj.initInfo();
        for(int e : ar) {
            System.out.println(e);
        }
    }
}

