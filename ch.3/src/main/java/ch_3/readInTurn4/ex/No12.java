
package ex;

public class No12{

    public static void main(String[] args){

        int i1, i2, i3;

        for(i1 = 1; i1 <= 5; i1++){

            for(i2 = 1; i2 <= i1; i2++){

                if(i2 == 1){
                    for(i3 = 5; i3 >= i1 + 1; i3--){
                        System.out.print(" ");
                    }
                }

                else{
                    System.out.print("");
                }

                System.out.print("*");
            }

            System.out.println();
        }
    }
}