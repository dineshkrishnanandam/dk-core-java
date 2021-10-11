package com.dex.tasks;

public class Task3 {

	    public static void main(String[] args) {

		int[] age = new int[5];
		age[0] = 1;
		age[1] = 2;
		age[2] = 3;
		age[3] = 4;
		age[4] = 5;
		int[] age3 = new int[10];

		System.out.println();
		System.out.println("age Elements");
		for (int i = 0; i < age.length; i++) {

			age3[i] = age[i];

		}

		int[] age2 = new int[5];
		age2[0] = 6;
		age2[1] = 7;
		age2[2] = 8;
		age2[3] = 9;
		age2[4] = 0;

		System.out.println();
		System.out.println("age2 Elements");
		for (int j = 0; j < age2.length; j++) {

			// System.out.println(age[i]);
			age3[age.length + j] = age2[j];

		}

		System.out.println();
		System.out.println("age3 Elements");
		for (int k = 0; k < age3.length; k++) {

			System.out.println(age3[k]);

		}

		System.out.println();
		System.out.println("age3 Elements DownWards");
		for (int k = 0; k < age3.length; k++) {

		//System.out.println(age3.length - k-1);
			
		System.out.println(age3[age3.length - k-1]);



		}

//		
//		System.out.println("age2 Elements");
//		for (int j = 0; j < age2.length; j++) {
//
//			System.out.println(age2[i]);
//		}
//		
//		int[] age3 = new int[10];
//		System.out.println();
//		System.out.println("age3 Elements");
//		for (int i = 0; i < 3.length; i++) {
//
//			System.out.println(age[i]+age2[i]);
//		}
//		

	}

}
