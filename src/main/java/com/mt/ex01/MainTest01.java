package com.mt.ex01;

public class MainTest01 {

	public static void main(String[] args) {
		MyRunnable runnableObj = null;
		Thread [] ts = null;
		try {
			runnableObj = new MyRunnable();
			ts = new Thread[] {
				new Thread(runnableObj,"T-1"),
				new Thread(runnableObj,"T-2"),
				new Thread(runnableObj,"T-3"),
				new Thread(runnableObj,"T-4")
			};
			
			for(Thread t : ts) {
				t.start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
