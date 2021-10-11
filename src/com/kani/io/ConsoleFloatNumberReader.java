package com.kani.io;

import java.util.Scanner;

public class ConsoleFloatNumberReader {

	public static void main(String[] args) {
		
		System.out.print("Enter your salary: "); 
		
		double salary = readNumber();
		
		System.out.println("Your salary is " + salary);
	
	}

	
	public static double readNumber() {
		
		double inputNumber = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
		inputNumber = scanner.nextDouble();
		
		scanner.close();
		
		return inputNumber;
		
	}
	
	
}
