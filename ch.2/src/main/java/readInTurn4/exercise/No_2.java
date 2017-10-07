
package exercise;

    public class No_2 {
        public static void main(String[] args){

            final float PI = 3.14f;
            final int r = 5;

            double sqr = PI*Math.pow((float)r,2);
            System.out.println("원의 면적 : "+sqr);

            double rr = 2*PI*(float)r;
            System.out.println("원의 면적 : "+rr);

        }
    }