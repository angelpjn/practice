
package exercise;

import java.util.Scanner;

    public class No_6 {
        public static void main(String[] args){

            Scanner sx = new Scanner(System.in);

            final float ic = 2.54f;
            final float ft = 12*2.54f;
          
            System.out.print("키를 입력하세요.(Cm 기준) : ");
            float num = sx.nextFloat();

            System.out.print("키를 인치(inch)로 변환 : "+num / +ic );
            System.out.println("inch");
            
            System.out.print("키를 피트(feet)로 변환 : "+num / +ft );
            System.out.println("feet");

            sx.close();
        }
    }