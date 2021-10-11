package com.dex.tasks;

public class Task7 {

	public static void main(String[] args) {

		long[] num = new long[5];
		num[0] = 14759574579345L;
		num[1] = 14759474579345L;
		num[2] = 14759374779345L;
		num[3] = 14753374579345L;
		num[4] = 14759354579345L;
		

//		long a = 12332L;
//		long b = 3543534d5L;
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

			if((num[i] - biggest) > 0) {
				biggest = num[i];
			}

		}

		System.out.println("Biggest of all given number = " + biggest);
		
		
	
	}

}
