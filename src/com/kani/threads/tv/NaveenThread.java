package com.kani.threads.tv;

public class NaveenThread extends Thread {

	Toilet t;
	
	
  // Toilet is given to naveen using constructor injection 
	public NaveenThread(Toilet t) {
		super("N");
		this.t = t;
	}



	@Override
	public void run() {
//		t.useBowl();
		t.useTap();
	}

}
