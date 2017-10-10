
package readInTurn5.nonEx;

import java.util.Scanner;

public class SwitchVar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String creditRating;
        System.out.print("등급(1, 2, 3) : ");
        int rating = in.nextInt();
        double rate;

        switch (rating) {
        case 1 : rate = 0.01;
        break; 
        case 2 : rate = 0.02;
        break; 
        case 3 : rate = 0.03;
        break;
        default : rate = 0.0;
        break; 
        }

        System.out.println(rate);
        in.nextLine();
        System.out.print("등급(단일문자 A, B, C) : ");
        char grade = in.next().charAt(0);
        if ((grade >= 97) && (grade <= 122)) {
            grade -= 32;
        }

        switch (grade) {
            case 'A' : rate = 0.01;
            break;
            case 'B' : rate = 0.02;
            break;
            case 'C' : rate = 0.03;
            break;
            default : rate = 0.0;
            break; 
        }

        System.out.println(rate);
        in.nextLine();
        System.out.println("등급(문자열 A, B, C) : ");
        creditRating = in.nextLine();
        switch (creditRating) {
            case "A" : rate = 0.01;
            break;
            case "B" : rate = 0.02;
            break;
            case "C" : rate = 0.03;
            break;
            default : rate = 0.0;
            break;
        }

        System.out.println(rate);
        in.nextLine();
        in.close();
    }
}