
package ex;

public class No6 {

    public static int randomRange(int n1, int n2) {
        return (int)(Math.random() * (n2 - n1 + 1) + n1);
    }

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
        System.out.print(randomRange(7, 15) + ", ");
        }

        System.out.println();
        System.out.println("언제부터 int전환 시에 1이 나올까?");
        System.out.println(Math.nextDown(1.0));
        System.out.println((int)Math.nextDown(1.0));
        System.out.println((int)0.5);
        System.out.println((int)0.499999999999999999);
        System.out.println((int)0.51);
        System.out.println((int)0.61);
        System.out.println((int)0.71);
        System.out.println((int)0.81);
        System.out.println((int)0.91);
        System.out.println((int)0.99);

        System.out.println((int)0.99999999999999);//14자리
        System.out.println((int)0.999999999999999);//15자리
        System.out.println((int)0.9999999999999999);//16자리

        System.out.println("---이 위는 0 / 아래는 1---");
        System.out.println((int)0.99999999999999999);//17자리
        System.out.println((int)0.999999999999999999);//18자리
        System.out.println((int)0.9999999999999999999);//19자리

    }
}