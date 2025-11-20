package dev.nelon.counter;

public class MyThreadCounter extends Thread {
	
	private final Counter counter;
	private final int threadNum;
	
	public MyThreadCounter(Counter counter, int threadNum) {
		this.counter = counter;
		this.threadNum = threadNum;
	}
	
	@Override
	public void run() {
		System.out.println("Thread started num = " + threadNum);
		for (int i = 0; i < 5; i++) {
			counter.increment();
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("Thread ended num = " + threadNum);
	}
}
