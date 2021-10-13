package com.kani.threads.create2;

public class LearningJavaRunnable implements Runnable {

	@Override
	public void run() {

		for (int z = 0; z < 10; z++) {

			System.out.println("Learning Java... k=" + z);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}

	}

}
