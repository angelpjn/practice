﻿class ThreadEx extends Thread {
	int seq;

	public ThreadEx(int seq) {
		this.seq = seq;
	}

	public void run( ) {
		System.out.println("thread #" + this.seq + " 시작");
		try {
			Thread.sleep(1000); // 예외 처리문(try-catch 문)에 주목
		} catch (Exception e) { }
		System.out.println("thread #" + this.seq + " 종료");
	}
}
public class E1301 {
	public static void main(String[ ] args) {
		for (int i = 0; i < 5; i++) {
			Thread t = new ThreadEx(i);
			t.start( );
		}
		System.out.println("main 종료");
	}
}