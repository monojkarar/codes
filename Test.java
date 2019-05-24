package com.mac.java.multi.threading;

class A implements Runnable {
	private SynchronizedCounter synchronizedCounter = null;

	A(SynchronizedCounter synchronizedCounter) {
		this.synchronizedCounter = synchronizedCounter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronizedCounter.increment();
			System.out.println("Printing Counter value from A Thread : " + synchronizedCounter.getCount());
		}
	}
}

class B implements Runnable {
	private SynchronizedCounter synchronizedCounter = null;

	B(SynchronizedCounter synchronizedCounter) {
		this.synchronizedCounter = synchronizedCounter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronizedCounter.decrement();
			System.out.println("Printing Counter value from B Thread : " + synchronizedCounter.getCount());
		}
	}
}

class SynchronizedCounter {
	private int count = 0;

	public synchronized void increment() {
		count++;
	}

	public synchronized void decrement() {
		count--;
	}

	public synchronized int getCount() {
		return this.count;
	}

}

public class Test {

	public static void main(String[] args) throws InterruptedException {
		SynchronizedCounter sc = new SynchronizedCounter();
		A a = new A(sc);
		B b = new B(sc);
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();

		t2.start();

//		t1.join();

	}

}
