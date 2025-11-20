package dev.nelon;

public class Main {
	static void main() throws InterruptedException {
		// MyThread thread1 = new MyThread(1);
		// thread1.start();
		
		// MyThread thread2 = new MyThread(2);
		// thread2.start();
		
		/* for (int i = 0; i < 5; i++) {
			var thread = new MyThread(i);
			thread.start();
		} */
		
		for (int i = 0; i < 5; i++) {
//			var runnable = new MyRunnable(i);
			var thread = new Thread(() -> {
				System.out.println("Text");
			});
			thread.start();
//			thread.join();
//			System.out.println(i + " alive = " + thread.isAlive());
		}
	}
}
