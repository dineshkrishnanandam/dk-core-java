package com.kani.polymorphism;

public class TaskOne {

	public static void main(String[] args) {

		// String[] dinesh;
		String[] dinesh = args;

		args[1] = "Thanjavur";

		System.out.println("Argumented Elements");
		for (int i = 0; i < args.length; i++) {

			System.out.println(args[i]);
		}

		System.out.println("dinesh Elements");
		for (int i = 0; i < dinesh.length; i++) {

			System.out.println(dinesh[i]);
		}

	}
}
