
package ch_3.readInTurn4.ex;

public class No13{
    public static void main(String[] args){

        int i1, i2, i3;

        for(i1 = 1;i1 <= 5; i1++){
            if(i1 == 1){
            }                
            else{                
                for(i2 = 1;i2 <= i1 - 1;i2++){
                    System.out.print(" ");    
                }
            }
            for(i2 = 1;i2 <= 6 - i1; i2++){
                System.out.print("*");
            }
        }
        System.out.println();
    }
}