
package ex;

public class No14{
    public static void main(String[] args){

        int i1, i2, i3;

        for ( i1 = 1 ; i1 <= 5 ; i1++ ){

            if( i1 < 5 ){
                for( i2 = 1 ; i2 <= 5-i1 ; i2++){
                    System.out.print(" ");
                }
            }
            else{}

            for( i3 = 1 ; i3 <= i1*2 - 1 ; i3++ ){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
