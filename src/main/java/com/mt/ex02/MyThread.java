package com.mt.ex02;


public class MyThread extends Thread{
	
	private MyThreadLocal threadLocal = null;
	private static final int DURATION = 2000; // 2 seconds
	
	public MyThread(String threadName) {
		super.setName(threadName);
		threadLocal = new MyThreadLocal();		
	}
	
	@Override
	public void run() {
		try {
			while(this.threadLocal.get() <= 25) {				
				System.out.println(Thread.currentThread().getName()+" [ "+this.threadLocal.get()+" ]");
				this.threadLocal.set(this.threadLocal.get()+1);
				Thread.sleep(MyThread.DURATION);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
