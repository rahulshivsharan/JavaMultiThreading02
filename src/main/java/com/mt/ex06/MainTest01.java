package com.mt.ex06;

import java.util.concurrent.ForkJoinPool;

public class MainTest01 {

	public static void main(String[] args) {
		ForkJoinPool pool = null;
		ParentTask task = null;
		Integer finalCount = 0;
		try {
			
			/**
			 * Parent task is supplied with array of array's
			 * were each array contains set of numbers.
			 * Parent task spawns 3 different child tasks which operates on these 
			 * different arrays individually. 
			 * The final result is the sum of all the computed results been calculated
			 * in the child task.
			 */
			task = new ParentTask("PARENT-01", new int [] {
					10,20,30
			}, new int [] {
					40,50,60
			},new int [] {
					70,80
			});
			
			pool = new ForkJoinPool();
			finalCount = pool.invoke(task);
			System.out.println("Final Count "+finalCount);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
