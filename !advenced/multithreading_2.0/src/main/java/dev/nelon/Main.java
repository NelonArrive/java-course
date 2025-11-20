package dev.nelon;

public class Main {
	static void main() {
//		MyThread myThread = new MyThread();
//		myThread.start();
//
//		MyThread myThread2 = new MyThread();
//		myThread2.start();

		Thread thread = new Thread(new MyRunner());
		thread.start();
		
		System.out.println("dsfsdfsdf");
	}
}
