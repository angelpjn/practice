
package nonEx;

import java.util.Vector;

public class VectorEx2 extends Vector {
    public VectorEx2(int typeNumber) {
        super(typeNumber);
    }

    public static void main(String[] args) {
        VectorEx2 v = new VectorEx2(3);

        System.out.println("v의 용량은 : " + v.capacity());

        v.addElement(new Integer(88));
        v.addElement(new Double(12.25));
        v.addElement(new String("자바"));

        System.out.println("요소 총 개수 : " + v.elementCount);
        for(int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        if(v.contains("자바")) {
            System.out.println("인덱스 위치 : " + v.indexOf("자바"));
        }

        System.out.println("1번째 인덱스의 요소 : " + v.elementAt(1));
    }
}