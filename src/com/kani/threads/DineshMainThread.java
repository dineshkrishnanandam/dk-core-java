package com.kani.threads;

public class DineshMainThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("DineshMainThreadDemo::main: BEGIN");

		IPLScoreCheckerThread iplThread = new IPLScoreCheckerThread();
		DinnerThread dinnerThread = new DinnerThread();
		LearningJavaThread learningJavaThread = new LearningJavaThread();
		iplThread.start();
		//	  iplThread.run();
		dinnerThread.start();

		learningJavaThread.setPriority(9);
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
