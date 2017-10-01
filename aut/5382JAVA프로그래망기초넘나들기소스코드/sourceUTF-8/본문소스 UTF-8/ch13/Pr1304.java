class ThreadEx extends Thread {
	int sum;

	public void run( ) {
		synchronized (this) {
			for (int i = 0; i <= 100; i++) {
				sum += i;
			}
			notify( );
		}
	}
}

public class Pr1304 {
	public static void main(String[ ] args) {
		ThreadEx b = new ThreadEx( );
		b.start( );

		synchronized (b) {
			try {				
				b.wait( ); // b 작업이 끝날 때까지 기다려라
			} catch (InterruptedException e) {
				e.printStackTrace( );
			}

			System.out.println("1 + 2 + 3 + ... + 100 = " + b.sum);
		}
    }
}