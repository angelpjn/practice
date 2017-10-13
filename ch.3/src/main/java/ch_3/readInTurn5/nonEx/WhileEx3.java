
package ch_3.readInTurn5.nonEx;

public class WhileEx3 {
    public static void main(String[] args) {
        double doub = 1;
        while(true) {

            if( doub >= 5.0) {
                break;
            }
            System.out.printf("%.2f\t", doub);
            doub = doub + 0.5;
        }
        System.out.println();
    }
}