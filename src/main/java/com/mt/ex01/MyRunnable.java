package com.mt.ex01;

public class MyRunnable implements Runnable{

	private MyThreadLocal threadLocal = null;
	private static final int DURATION = 2000; // 2 seconds
	
	public MyRunnable() {
		this.threadLocal = new MyThreadLocal();
	}
	
	public void run() {
		try {
			while(this.threadLocal.get() <= 25) {
				System.out.println(Thread.currentThread().getName()+" [ "+this.threadLocal.get()+" ]");
				this.threadLocal.set(this.threadLocal.get()+1);
				Thread.sleep(MyRunnable.DURATION);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
}
