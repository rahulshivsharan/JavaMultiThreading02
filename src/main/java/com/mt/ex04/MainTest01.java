package com.mt.ex04;

import java.util.concurrent.CountDownLatch;

public class MainTest01 {
	public static void main(String [] args) {
		CountDownLatch latch = null;
		SharedResource resource = null;
		MyThread [] threads = null;
		try {
			latch = new CountDownLatch(5);
			resource = new SharedResource(latch);
			threads = new MyThread [] {
					new MyThread("Jack", resource),
					new MyThread("Tom", resource),
					new MyThread("Swan", resource),
					new MyThread("Petter", resource),
					new MyThread("John", resource)
			};
			
			for(MyThread t : threads) {
				t.start();
			}
			
			latch.await();
			System.out.println("MAIN THREAD COMPLETE");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
