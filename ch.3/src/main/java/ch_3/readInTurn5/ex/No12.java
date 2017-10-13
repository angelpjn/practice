
package ch_3.readInTurn5.ex;

public class No12 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 0 : System.out.print("    ");
                break;
                case 1 : System.out.print("   ");
                break;
                case 2 : System.out.print("  ");
                break;
                case 3 : System.out.print(" ");
                break;
                default : System.out.print("");
                break;
            }
            for ( int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}