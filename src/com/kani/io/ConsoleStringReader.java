package com.kani.io;

import java.util.Scanner;

public class ConsoleStringReader {

	public static void main(String[] args) {
		
		System.out.print("Enter your name: "); 
		
		String name = readString();
		
		System.out.println("Hello " + name);
	
	}

	
	public static String readString() {
		
		String inputString = "";
		
		Scanner scanner = new Scanner(System.in);
		
		inputString = scanner.nextLine();
		
		scanner.close();
		
		return inputString;
		
	}
	
	
}
