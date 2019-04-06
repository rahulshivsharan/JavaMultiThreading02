package com.mt.ex05;

import java.util.concurrent.RecursiveAction;


public class CustomRecursiveAction extends RecursiveAction{
	
	public CustomRecursiveAction(String str,int duration) {
		this.name = str;
		this.duration = duration;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1464635353646463L;
	private final String name;
	private final int duration;

	/*
	 * (non-Javadoc)
	 * @see java.util.concurrent.RecursiveAction#compute()
	 * 
	 * This is the method which we need to override, 
	 */
	@Override
	protected void compute() {
		try {			
			System.out.println(this.name+", waiting till "+this.duration);
			Thread.sleep(duration); // Wait for the duration of time
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
