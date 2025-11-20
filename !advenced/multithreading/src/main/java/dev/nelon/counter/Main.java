package dev.nelon.counter;

import java.util.ArrayList;
import java.util.List;

public class Main {
	static void main() throws InterruptedException {
		
		List<Thread> threadsList = new ArrayList<>();
		
		var counter = new Counter();
		
		for (int i = 0; i < 5; i++) {
			Thread thread = new MyThreadCounter(counter, i);
			thread.start();
			threadsList.add(thread);
		}
		
		System.out.println("Цикл завершён");
		
		for (Thread thread : threadsList) {
			thread.join();
		}
		
		System.out.println("Counter = " + counter.get());
	}
}
