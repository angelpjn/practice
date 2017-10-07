
package readInTurn5.nonEx;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {

        String str1, str2, str3, address;
        int i1;
        double dob1;

        Scanner scan = new Scanner(System.in);
        System.out.print("연속하여 3개의 문자를 입력(공백으로 구분) : ");
        str1 = scan.next();
        str2 = scan.next();
        str3 = scan.next();
        System.out.printf("%s\t%s\t%s\n", str1, str2, str3);

        System.out.print("정수 입력 : ");
        i1 = scan.nextInt();
        System.out.printf("정수 : %d\n", i1);

        System.out.print("몸무게 입력 : ");
        dob1 = scan.nextDouble();
        System.out.printf("몸무게 : %.2f\n", dob1);
        scan.nextLine();

        System.out.print("주소 입력 : ");
        address = scan.nextLine();
        System.out.printf("주소 : %s\n", address);

        scan.close();

        Scanner sc = new Scanner("2030/08/15");
        sc.useDelimiter("/");
        while(sc.hasNext()) {
        System.out.print(sc.next() + "\t");
        }
        System.out.println("---end---");
        sc.close();


    }
}