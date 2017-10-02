
package ex.no5678;

import java.util.Scanner;

public class No8 {

    public static void main(String[] args) {

        BookNo7 book = new BookNo7();

        Scanner scan = new Scanner(System.in);

        System.out.print("저자명 : ");
        book.name = scan.next();

        System.out.print("도서명 : ");
        book.title = scan.next();
        
        System.out.print("가격 : ");
        book.price = scan.nextInt();
        
        System.out.print("이익률 : ");
        book.margin = scan.nextDouble();
        
        System.out.print("세율 : ");
        book.taxRate = scan.nextDouble();
        
        System.out.print("판매부수 : ");
        book.sell = scan.nextInt();
        
        System.out.print("출판사 : ");
        book.publisher = scan.next();

        System.out.println();
        System.out.println(book);
    }
}