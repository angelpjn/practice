class SharedData {
	private boolean isNew = false;
	private String data;

	public synchronized void put(String data) {
		try {
			while (isNew) // 새로운 데이터인가?
				wait( ); // 기다려라(unlocked)
		} catch (InterruptedException e) {  }
		this.data = data;
		isNew = true;
		notifyAll( );
	}

	public synchronized String get( ) {
		try {
			while (!isNew) // 기존 데이터인가?
				wait( ); // 기다려라(unlocked)
		} catch (InterruptedException e) { }
		isNew = false;
		notifyAll( ); // 모두 깨운다
		return data; // until this method exits
	}
}

class Write extends Thread {
	private SharedData shared;
	private String data;

	public Write(SharedData shared, String data) {
		this.shared = shared;
		this.data = data;
	}

	public void run( ) {
		shared.put(data);
		shared.put(data + " 배우기");
	}
}

class Read extends Thread {
	SharedData shared;

	public Read(SharedData shared) { 	this.shared = shared; }

	public void run( ) {
		while (true)
			System.out.println(getName( ) + " 데이터: " + shared.get( ));
	}
}

public class Pr1303 {
	public static void main(String[ ] args) {
		SharedData sd = new SharedData( );
		Read r1 = new Read(sd);
		Read r2 = new Read(sd);
		Write w1 = new Write(sd, "Java");
		Write w2 = new Write(sd, "Good");
     r1.start( );
		r2.start( );
		w1.start( );
		w2.start( );
	}
}