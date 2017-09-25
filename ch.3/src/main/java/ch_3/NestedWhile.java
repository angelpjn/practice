
package ch_3;

public class NestedWhile{
    public static void main(String[] args){

        int y = 2;

        while(y < 10){

            int x = 2;

            while(x < 10){

                System.out.print(x +"*" +y +" = " +x*y +"\t");
                
                x++;
            }

            System.out.println();

            y++;
        }

        System.out.println("\n구구단 끝");
    }
}