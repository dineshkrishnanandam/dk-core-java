package com.kani.threads;

public class IPLScoreCheckerThread extends Thread {

	@Override
	public void run() {

		for (int k = 0; k < 50; k++) {

			System.out.println("Checking IPL score... k=" + k);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
