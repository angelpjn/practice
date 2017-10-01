class ThreadEx extends Thread {
	public void run( ) {
		System.out.println("I can do it!");
	}
}

public class Pr1301 {
	public static void main(String args[ ]) {
		(new ThreadEx( )).start( );
	}
}