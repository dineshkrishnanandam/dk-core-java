package com.dex.tasks;

public class Smallest {

	public static void main(String[] args) {

		long[] num = new long[5];
		num[0] = 14759574579345L;
		num[1] = 14759474579345L;
		num[2] = 14759374779345L;
		num[3] = 14753374579345L;
		num[4] = 14759354579345L;
		

		System.out.println();
		System.out.println("num Elements");
		
		long smallest = num[0];
		for (int i = 1; i < num.length; i++) {

			if((num[i] - smallest) < 0) {
				smallest = num[i];
			}

		}

		System.out.println("Smallest of all given number = " + smallest);
		
		
	
	}

}
