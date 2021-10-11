package com.kani.io;

import java.util.Scanner;

public class ConsoleDoubleNumberReader {

	public static void main(String[] args) {
		
		System.out.print("Enter your salary: "); 
		
		float salary = readNumber();
		
		System.out.println("Your salary is " + salary);
	
	}

	
	public static float readNumber() {
		
		float inputNumber = 0.0f;
		
		Scanner scanner = new Scanner(System.in);
		
		inputNumber = scanner.nextFloat();
		
		scanner.close();
		
		return inputNumber;
		
	}
	
	
}
