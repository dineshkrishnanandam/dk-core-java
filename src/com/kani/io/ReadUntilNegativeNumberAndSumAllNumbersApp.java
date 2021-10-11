package com.kani.io;

import java.util.Scanner;

public class ReadUntilNegativeNumberAndSumAllNumbersApp {

	public static void main(String[] args) {

		int inputNumber = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			
			sum = sum + inputNumber;
			inputNumber = scanner.nextInt();
		
		} while (inputNumber >= 0);

		scanner.close();
		
		System.out.println("Sum=" + sum);

	}

}
