package com.mt.ex04;

public class MyThread extends Thread{
	
	private SharedResource res = null;
	
	public MyThread(String threadName, SharedResource resource) {
		super.setName(threadName);
		res = resource;
	}
	
	@Override
	public void run() {
		try {
			res.doIt();			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
