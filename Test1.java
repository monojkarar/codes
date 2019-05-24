package com.mac.java.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTest implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		return new Integer(101);
	}

}

public class Test1 {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(1);

		CallableTest callableTest = new CallableTest();

		Future<Integer> result = executorService.submit(callableTest);

		try {
			System.out.println(result.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		if (!executorService.isShutdown()) {
			executorService.shutdown();
		}
	}

}
