class Thread1 implements Runnable {
	public void run( ) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thrad1 : " + i);
		}
	}
}

class Thread2 implements Runnable {
	public void run( ) {
		for (char ch = 'A'; ch < 'Z'; ch++) {
			System.out.println("Thrad2 : " + ch);
		}
	}
}
public class E1309 {
	public static void main(String args[ ]) {
		Thread1 t1 = new Thread1( );
		Thread2 t2 = new Thread2( );
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		th1.start( );
		th2.start( );
	}
}