package com.mt.ex02;

public abstract class CustomThreadLocal<T> {
	
	protected T val;
	
	public abstract T initialValue(); 
	
	public abstract T get();
	
	public abstract void set(T t);
		
	
}
