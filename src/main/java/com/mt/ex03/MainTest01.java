package com.mt.ex03;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainTest01 {

	public static void main(String[] args) {
		BlockingQueue<String> q = null;
		Producers [] ps = null;
		Cosumers [] cs = null;
		try {
			q = new ArrayBlockingQueue<String>(3);
			ps = new Producers[] { new Producers(q, "PRODUCER-01"), new Producers(q, "PRODUCER-02") };
			cs = new Cosumers [] {
					new Cosumers(q, "CONSUMER-01"),
					new Cosumers(q, "CONSUMER-02"),
					new Cosumers(q, "CONSUMER-03"),
					new Cosumers(q, "CONSUMER-04")
			};
			
			for(Producers p : ps) {
				p.start();
			}
			
			for(Cosumers c : cs) {
				c.start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
