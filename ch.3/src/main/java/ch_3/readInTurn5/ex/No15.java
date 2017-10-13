
package ch_3.readInTurn5.ex;

public class No15 {
    public static void main(String[] args) {
    
        int i, j;

        for (i = 0; i <= 6; i ++) {

            if( i < 4) {

                switch (i) {
                    case 0 : System.out.print("   ");
                    break;
                    case 1 : System.out.print("  ");
                    break;
                    case 2 : System.out.print(" ");
                    break;
                    default : System.out.print("");
                    break;
                }

                for (j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
            }
            else {

                switch (i) {
                    case 4 : System.out.print(" ");
                    break;
                    case 5 : System.out.print("  ");
                    break;
                    default : System.out.print("   ");
                    break;
                }

                for (j = 0; j < 15 - 2 * (i + 1); j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}