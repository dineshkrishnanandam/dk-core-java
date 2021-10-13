package com.kani.threads;

public class DinnerThread extends Thread {

	@Override
	public void run() {

		for (int d = 0; d < 10; d++) {
			
			if(d == 5) {
				System.out.println("I am having my 5th Spoon of my dinner");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("I am done having my dinner.");

	}

}
