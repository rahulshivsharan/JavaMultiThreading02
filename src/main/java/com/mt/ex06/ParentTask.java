package com.mt.ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class ParentTask extends RecursiveTask<Integer>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1405678056430L;
	
	private final String taskName;
	private List<int[]> numList;
	
	public ParentTask(String taskName,int[]... intArugments){
		this.taskName = taskName;
		numList = new ArrayList<int[]>(); 
		for(int[] intNums : intArugments) {
			numList.add(intNums);
		}
	}

	/**
	 * 'compute' is the method which has to be override
	 * from RecursiveTask.
	 * ChildTasks are created and started for its individual 
	 * run, by fork.
	 * 
	 * Finally each child task returns the result of total sum of number's
	 * supplied to each Child task, which is then again sumed. This is done by 'join'
	 * method.
	 *  
	 */
	@Override
	protected Integer compute() {
		List<ChildTask> childrens = null;
		ChildTask task = null;
		int childCount = 1;
		String childName = "";
		int result = 0;
		try {
			childrens = new ArrayList<ChildTask>();
			for(int [] numArray : this.numList) {
				childName = "CHILD-";
				childName = childName.concat(String.valueOf(childCount));
				task = new ChildTask(childName, numArray);
				task.fork();
				childrens.add(task);
				childCount++;
			}
			
			for(ChildTask childTask : childrens) {
				result += childTask.join();
			}
			System.out.println(this.taskName+" execution completed");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
