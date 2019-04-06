package com.mt.ex06;

import java.util.concurrent.RecursiveTask;

public class ChildTask extends RecursiveTask<Integer>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1703435025834230L;
	private final int [] numList;
	private final String threadName;
	
	public ChildTask(String threadName,int [] numList) {
		this.numList = numList;
		this.threadName = threadName;
	}

	@Override
	protected Integer compute() {
		int subTotal = 0;
		
		try {
			for(Integer num : numList) {
				subTotal += num;
				System.out.println(this.threadName+" is calculation subtotal "+subTotal);
				Thread.sleep(5000); // wait for 5 seconds
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return subTotal;
	}
	
}
