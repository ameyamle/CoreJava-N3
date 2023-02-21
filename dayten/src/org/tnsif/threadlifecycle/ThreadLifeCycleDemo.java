package org.tnsif.threadlifecycle;

public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		Tech t = new Tech();
		SoftSkill s = new SoftSkill();
		t.start();
		//yield used to move another thread
		t.yield();
		s.start();
	}

}
