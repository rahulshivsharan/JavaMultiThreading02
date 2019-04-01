package com.mt.ex04;

import java.util.concurrent.CountDownLatch;

public class SharedResource {
	private CountDownLatch latch;
	
	public SharedResource(CountDownLatch latch) {
		this.latch = latch;
	}
	
	public void doIt() throws Exception{
		System.out.println(Thread.currentThread().getName()+" is running ....... ");		
		this.latch.countDown();
	}
}
