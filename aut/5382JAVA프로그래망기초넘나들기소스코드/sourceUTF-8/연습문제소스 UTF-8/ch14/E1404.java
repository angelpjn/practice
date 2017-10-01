import java.io.*;
public class Ex1404 {
	 public static void main(String args[ ]) {  
		 File source = new File("c:/work/java/test.txt");  
		 File target1 = new File("c:/work/java/test2.txt");
		 File target2 = new File("c:/work/java/test3.txt");  
		  
		 FileInputStream fis = null;  // 버퍼링이 지원되지 않는 스트림   
		 FileOutputStream fos = null; 		  
		 BufferedInputStream bis = null;   // 버퍼링이 지원되는 스트림  
		 BufferedOutputStream bos = null;   
		 try {   
			 fis = new FileInputStream(source);  
			 fos = new FileOutputStream(target1);   
			 long startTime = System.currentTimeMillis( );  
			 while (true) {        
				 int x = fis.read( );   
				 if (x == -1) {       
					 break; 
                                 }
				 fos.write(x);  
				 }    
			 long endTime = System.currentTimeMillis( ) - startTime; 
			 System.out.println("일반 스트림: " + endTime); 
			 fis.close( );      
			 fos.close( );       
			 // 버퍼링 지원 스트림    
			 bis = new BufferedInputStream(new FileInputStream(source));       		      bos = new BufferedOutputStream(new FileOutputStream(target2));
			 startTime = System.currentTimeMillis( );   
			 while (true) {       
				 int x = bis.read( );   
				 if (x == -1) {   
					 break;  
					 }    
				 bos.write(x);    
				 }    
			 endTime = System.currentTimeMillis( ) - startTime;    
			 System.out.println("버퍼링 스트림: " + endTime); 
			 bis.close( );    
			 bos.close( );   
			 } catch (FileNotFoundException e) {  
				 e.printStackTrace( );
				 } catch (IOException e) { 
					 e.printStackTrace( );   
					 }  
		 }
}