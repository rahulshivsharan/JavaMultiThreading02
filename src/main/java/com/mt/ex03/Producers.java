package com.mt.ex03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.BlockingQueue;

public class Producers extends Thread{
	
	private BlockingQueue<String> queue = null;
	private static final int DURATION = 5000; // 5 seconds
	
	public Producers(BlockingQueue<String> q,String threadName) {
		super.setName(threadName);
		this.queue = q;
	}
	
	@Override
	public void run() {
		boolean flag = true;
		String msg = null;
		int count = 1;
		try {
			while(count <= 25) {
				msg = createMessage();
				queue.put(msg);
				count++;
				System.out.println(Thread.currentThread().getName()+" produces num "+msg);				
				Thread.sleep(DURATION);				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private String createMessage() throws Exception{
		String msg = null;
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("h:m:s.SS a");
		msg = df.format(d);
		return msg;
	}
}
