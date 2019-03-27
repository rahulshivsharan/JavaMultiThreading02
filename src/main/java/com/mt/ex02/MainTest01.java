package com.mt.ex02;

public class MainTest01 {
	public static void main(String [] args) {
		MyThread [] threads = null;
		try {
			threads = new MyThread[] {
				new MyThread("T-1"),
				new MyThread("T-2"),
				new MyThread("T-3"),
				new MyThread("T-4")				
			};
			
			for(Thread t : threads) {
				t.start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
