import java.io.IOException;

public class ConsoleInput{
    public static void main(String[] args) throws
        IOException{
            System.out.println("하나의 문자를 입력 : ");
            int vi = System.in.read();
            System.in.skip(2);

            System.out.println("하나의 문자를 입력 : ");
            int input = System.in.read();
            System.in.skip(2);

            System.out.println("하나의 문자를 입력 : ");
            int input2 = System.in.read();

            System.out.print(vi+" ");
            System.out.println((char)vi);
            System.out.println((char)input);
            System.out.println((char)input2);
        } 
    } 
 