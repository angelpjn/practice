
package ch_3.readInTurn4.ex;

import java.util.Scanner;

public class No7{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("문자를 입력하세요 : ");

        char a = sc.next().charAt(0);
        char b;

        switch(a){

        case 'A' : b = 'm';
        break;

        case 'E' : b = 'm';
        break;

        case 'I' : b = 'm';
        break;

        case 'O' : b = 'm';
        break;

        case 'U' : b = 'm';
        break;
        
        default : b = 'j';
        break;

        }

        System.out.println(b);

        sc.close();

    }
}