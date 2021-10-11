package com.dex.tasks;

public class DescendingOrderApp {

	public static void main(String[] args) {

		long[] num = new long[5];
		num[0] = 5;
		num[1] = 3;
		num[2] = 7;
		num[3] = 9;
		num[4] = 0;

		System.out.println();
		long temp = 0;

		for (int i = 0; i < num.length; i++) {

			for (int j = i; j < num.length; j++) {
				if (num[i] > num[j]) {
					// swap
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}

		}

		for (int j = 0; j < num.length; j++) {

			System.out.println(num[j]);
		}

	}

}
