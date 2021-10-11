package com.dex.tasks;

public class Task2 {

	public static void main(String[] args) {

		String[] dexter = new String[4];

		System.out.println("Arguments Elements");
		System.out.println();

		for (int i = 0; i < args.length; i++) {

			System.out.println(args[i]);

			dexter[i] = args[i];

		}
		args[1] = "Thanjavur";

		System.out.println();
		System.out.println("dexter Elements");
		for (int i = 0; i < dexter.length; i++) {

			System.out.println(dexter[i]);
		}

		
		System.out.println();
		System.out.println("Arguments Elements");

		for (int i = 0; i < args.length; i++) {

			System.out.println(args[i]);

		}

	}

}
