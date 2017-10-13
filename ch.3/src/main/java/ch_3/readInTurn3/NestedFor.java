
package ch_3.readInTurn3;

public class NestedFor{
    public static void main(String[] args){

        for(int x=2; x<=9; x++)
        {
          
            for(int y = 2; y <= 9; y++)
            {
                System.out.print(x*y+"\t");
            }
        
            System.out.println();

        }

        System.out.println("\n구구단 끝");
    }
}