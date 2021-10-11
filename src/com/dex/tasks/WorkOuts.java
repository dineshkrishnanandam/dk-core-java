package com.dex.tasks;

public class WorkOuts {

	public static void main(String[] args) {

		// Initiation an array at declaration time
		
		String[] names = { "Ravi", "Ram" };
		int length = names.length;
		
		// Print all names before changes
		
		for (int i = 0; i < length; i++)
			System.out.println("Names of Students = " + names[i]);
	

		// Changing value of elements
		
		names[0] = "Radhe";
		
		// Print all names before changes
		
		for (int i = 0; i < length; i++)
			System.out.println("After changes names of Students = " + names[i]);

	}

}
