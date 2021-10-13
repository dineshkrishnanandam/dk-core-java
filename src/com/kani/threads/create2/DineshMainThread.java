package com.kani.threads.create2;

public class DineshMainThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("DineshMainThreadDemo::main: BEGIN");

		IPLScoreCheckerRunnable iplRunnable = new IPLScoreCheckerRunnable();
		DinnerRunnable dinnerRunnable = new DinnerRunnable();
		LearningJavaRunnable learningJavaRunnable = new LearningJavaRunnable();
	
		Thread iplThread = new Thread(iplRunnable);
		Thread dinnerThread = new Thread(dinnerRunnable);
		Thread learningJavaThread = new Thread(learningJavaRunnable);
		
		
		iplThread.start();
//		  iplThread.run();
		dinnerThread.start();

		learningJavaThread.setPriority(10);
		learningJavaThread.start();

//		System.out.println("IplThread : " + iplThread.getPriority());
//
//		System.out.println("CurrentThread : " + Thread.currentThread().getPriority());

		for (int i = 0; i < 10; i++) {

			System.out.println("Dinesh Main Thread: i=" + i);

//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

		}

		iplThread.join();
		learningJavaThread.join();
		dinnerThread.join();

		System.out.println("ThreadDemo::main: END");

	}

}
