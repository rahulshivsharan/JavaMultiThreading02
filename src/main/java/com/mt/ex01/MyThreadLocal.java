package com.mt.ex01;

public class MyThreadLocal extends ThreadLocal<Integer>{
	
	
	
	@Override
	protected Integer initialValue() {
		return 0;
	}
	
	
}
