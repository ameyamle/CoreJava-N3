package org.tnsif.threaddemo;

public class SynchronizationDemoExecutor {

	public static void main(String[] args) {
		SynchronizationDemo d = new SynchronizationDemo();
		ThreadOne t1 = new ThreadOne(d);
		ThreadTwo t2 = new ThreadTwo(d);
		t1.start();
		t2.start();
	}

}
