package org.tnsif.threaddemo;

public class SynchronizationDemo {
	synchronized void print(int num) throws InterruptedException {
		for(int i = 0; i <=5 ; i++) {
			System.out.println(num*i);
		}
	}

}
class ThreadOne extends Thread{
	SynchronizationDemo obj;

	public ThreadOne(SynchronizationDemo obj) {
		super();
		this.obj = obj;
	}
	
	public void run() {
		try {
			obj.print(10);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ThreadTwo extends Thread{
	SynchronizationDemo obj;

	public ThreadTwo(SynchronizationDemo obj) {
		super();
		this.obj = obj;
	}
	
	public void run() {
		try {
			obj.print(15);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}