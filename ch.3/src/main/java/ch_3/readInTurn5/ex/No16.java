
package ch_3.readInTurn5.ex;

public class No16 {
    public static void main(String[] args) {
        int i, j, count;

        for(j = 1; j < 10; j++) {
            count = 0;

            for(i = 2; i < 10; i++) {

                ++count;
                System.out.print(i + " x " + j + " = " + i * j + "\t");
                
                if (count == 3) {
                    break;
                }
            }
            System.out.println();
        }

        for(j = 1; j < 10; j++) {
            count = 0;

            for(i = 5; i < 10; i++) {

                ++count;
                System.out.print(i + " x " + j + " = " + i * j + "\t");
                
                if (count == 3) {
                    break;
                }
            }
            System.out.println();
        }

        for(j = 1; j < 10; j++) {
            count = 0;

            for(i = 8; i < 10; i++) {

                ++count;
                System.out.print(i + " x " + j + " = " + i * j + "\t");
                
                if (count == 3) {
                    break;
                }
            }
            System.out.println();
        }
    }
}