package com.kani.threads.tv;

public class DineshThread extends Thread {

	Toilet t;

	  // Toilet is given to dinesh using constructor injection 

	public DineshThread(Toilet t) {
		super("D");
		this.t = t;
	}

	@Override
	public void run() {
		t.useBowl();
	}

}
