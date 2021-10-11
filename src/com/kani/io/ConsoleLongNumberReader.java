package com.kani.io;

import java.util.Scanner;

public class ConsoleLongNumberReader {

	public static void main(String[] args) {
		
		System.out.print("Enter your age: "); 
		
		long age = readNumber();
		
		System.out.println("Your age is " + age);
	
	}

	
	public static long readNumber() {
		
		long inputNumber = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		inputNumber = scanner.nextLong();
		
		scanner.close();
		
		return inputNumber;
		
	}
	
	
}
