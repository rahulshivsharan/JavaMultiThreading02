package com.mt.ex03;

import java.util.concurrent.BlockingQueue;

public class Cosumers extends Thread{
	private BlockingQueue<String> queue = null;
	private static final int DURATION = 2000; // 2 seconds
	
	public Cosumers(BlockingQueue<String> q,String threadName) {
		super.setName(threadName);
		this.queue = q;
	}
	
	@Override
	public void run() {
		boolean flag = true;		
		String msg = null;
		try {
			while(flag == true) {				
				msg = this.queue.poll();
				
				if(msg != null) {
					System.out.println(Thread.currentThread().getName()+" consumes num "+msg);
				}
					
				Thread.sleep(DURATION);				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
