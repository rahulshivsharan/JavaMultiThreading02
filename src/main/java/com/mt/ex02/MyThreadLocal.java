package com.mt.ex02;

public class MyThreadLocal extends CustomThreadLocal<Integer>{
	
	public MyThreadLocal() {
		this.initialValue();
	}

	@Override
	public Integer initialValue() {
		this.val = 0;
		return this.val;
	}

	@Override
	public Integer get() {
		return this.val;
	}

	@Override
	public void set(Integer i) {
		this.val = i;
	}
	
}
