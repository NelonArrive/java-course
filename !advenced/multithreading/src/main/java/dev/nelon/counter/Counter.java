package dev.nelon.counter;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	
	private final AtomicInteger counter;
	
	public Counter() {
		this.counter = new AtomicInteger();
	}
	
	public synchronized void increment() {
		counter.incrementAndGet();
	}
	
	public int get() {
		return counter.get();
	}
	
}
