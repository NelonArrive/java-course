package dev.nelon;

public class MyRunnable implements Runnable {
	
	private final int threadNum;
	
	public MyRunnable(int threadNum) {
		this.threadNum = threadNum;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " from thread " + threadNum);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
