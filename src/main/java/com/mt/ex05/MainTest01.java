package com.mt.ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;

public class MainTest01 {

	public static void main(String[] args) {
		
		List<CustomRecursiveAction> actionList = null;
		try {
			actionList = new ArrayList<CustomRecursiveAction>();
			actionList.add(new CustomRecursiveAction("JOHN",10000));
			actionList.add(new CustomRecursiveAction("GEETA",5000));
			actionList.add(new CustomRecursiveAction("SIKTHAR",2000));
			
			ForkJoinTask.invokeAll(actionList);
			System.out.println("This is it.....");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
