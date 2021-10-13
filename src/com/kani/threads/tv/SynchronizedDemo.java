package com.kani.threads.tv;

public class SynchronizedDemo {

	public static void main(String[] args) {

		Toilet toilet = new Toilet();

		DineshThread dineshThread = new DineshThread(toilet);
		NaveenThread naveenThread = new NaveenThread(toilet);
		
		dineshThread.start();
		naveenThread.start();

	}

}
