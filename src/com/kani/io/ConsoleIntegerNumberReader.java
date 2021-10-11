package com.kani.io;

import java.util.Scanner;

public class ConsoleIntegerNumberReader {

	public static void main(String[] args) {
		
		System.out.print("Enter your age: "); 
		
		int age = readNumber();
		
		System.out.println("Your age is " + age);
	
	}

	
	public static int readNumber() {
		
		int inputNumber = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		inputNumber = scanner.nextInt();
		
		scanner.close();
		
		return inputNumber;
		
	}
	
	
}
