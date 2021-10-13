package com.kani.threads.tv;

public class Toilet {

	synchronized public void useBowl() {
		System.out.println("Toilet is locked by " + Thread.currentThread().getName());

		for (int k = 0; k < 5; k++) {

			System.out.println("Toilet.bowl is used by " + Thread.currentThread().getName() + "  k=" + k);
			this.useTap();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("Toilet is freed by " + Thread.currentThread().getName());

	}

	synchronized public void useTap() {
		System.out.println("Toilet is locked by " + Thread.currentThread().getName());
//		System.out.println("Toilet tap  is used by " + Thread.currentThread().getName());
		for (int k = 0; k < 5; k++) {

			System.out.println("Toilet.Tap  is used by " + Thread.currentThread().getName() + "  k=" + k);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("Toilet tap is free " + Thread.currentThread().getName());

	}

}
