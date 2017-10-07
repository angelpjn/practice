
package readInTurn5.nonEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a, b;
        System.out.println("정수 입력 : ");
        a = Integer.parseInt(br.readLine());

        System.out.println("정수 입력 : ");
        b = Integer.parseInt(br.readLine());

        System.out.println(a + "\t" + b);

        System.out.print("연속하여 3개의 문자를 입력 : ");
        System.out.print((char)br.read() + "\t");
        System.out.print((char)br.read() + "\t");
        System.out.println((char)br.read());
    }
}