public class While {
   public static void main(String[ ] args) {
      int x = 1;	
      while(x <= 5) { // 1, 2, 3, 4, 5 될 때 까지 { } 속 반복      
    	   System.out.print(x + " , ");
    	   x++;	 // x = x + 1, 숫자를 1씩 증가 
      }
      System.out.println( );
   }
}