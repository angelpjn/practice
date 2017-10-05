
package nonEx;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();

        System.out.println("vector 내의 요소 객체 수 : " + v.size());
        System.out.println("vector의 기본 용량 : " + v.capacity());

        v.addElement(33);
        v.addElement(7788);
        v.addElement(12);

        System.out.println("vector 내의 요소 객체 수 : " + v.size());
        System.out.println("vector의 용량 : " + v.capacity());

        for(int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        System.out.println("vector의 첫번째 요소 : " + v.elementAt(0));
    }
}