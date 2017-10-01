class RunnableThread implements Runnable {
	public void run( ) {
		System.out.println("I can do it!");
	}
}

public class Pr1302 {
	public static void main(String args[ ]) {
		(new Thread(new RunnableThread( ))).start( );
	}
}