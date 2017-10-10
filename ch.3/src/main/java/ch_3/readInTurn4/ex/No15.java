
package ex;

public class No15{
    public static void main(String[] args){
        int i1, i2, i3;

        for(i1 = 1;i1 <= 7;i1++ ){

            if(i1 <= 4){

                for(i2 = 2;i1 -1 <= i2; i2--){
                    System.out.print(" ");
                }

                for(i3 = 1;i3 <= i1*2 -1; i3++){
                    System.out.print("*");
                }
           
                System.out.println();
            }

            else{

                for(i2 = 1;i2 <= i1-4 ; i2++){
                    System.out.print(" ");
                }
                for(i3 = 1;i3 <= 15 - 2*i1 ; i3++){
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }
}