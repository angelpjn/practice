
package ex;

public class No4 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println("capacity = " + sb1.capacity());

        StringBuffer sb2 = new StringBuffer(100);
        System.out.println("capacity = " + sb2.capacity());

        StringBuffer sb = new StringBuffer("can");
        System.out.println("문자 개수 = " + sb.length());
        System.out.println("capacity = " + sb.capacity());

        String str = "I can" + "do it.";
        System.out.println(str);
        System.out.println("문자 개수 = " + str.length());
        
    }
}