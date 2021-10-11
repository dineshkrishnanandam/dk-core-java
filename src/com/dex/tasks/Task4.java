package com.dex.tasks;

public class Task4 {

	public static void main(String[] args) {

		long[] num = new long[5];
		num[0] = 5;
		num[1] = 4;
		num[2] = 3;
		num[3] = 2;
		num[4] = 1;

//		long a = 12332L;
//		long b = 35435345L;
//		long c = 435345453L;
//		
//		long biggest = a;
//		
//		if(b > biggest) {
//			biggest = b;
//		}
//		if(c > biggest) {
//			biggest = c;
//		}
//		

		System.out.println();
		System.out.println("num Elements");

		long biggest = num[0];
		for (int i = 1; i < num.length; i++) {

			if (num[i] > biggest) {
				biggest = num[i];
			}

		}

		System.out.println("Biggest of all given number = " + biggest);

	}

}
