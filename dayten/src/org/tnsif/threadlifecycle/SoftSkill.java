package org.tnsif.threadlifecycle;

public class SoftSkill extends Thread{
	public void run() {
		System.out.println("Professional Ethics");
		for(int i = 10; i <= 15; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("SoftSkill Session");
	}

}
