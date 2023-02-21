package org.tnsif.threaddemo;

public class ThreadExecutor {

	public static void main(String[] args) {
		SimpleThreadProgram p = new SimpleThreadProgram();
		
		//change name of thread
		p.setName("Java Thread");
		
		//change priority
		p.setPriority(8);
		
		//when thread calls 
		p.start();
		p.run();
		System.out.println("Current thread: "+ p);

	}

}
