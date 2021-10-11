package com.kani.controlstatements;

public class DigitFinder {

	public static int findFirstDigit(int number) {

		int firstDigit = number % 10;

		return firstDigit;

	}

	public static int findNumberWithoutFirstDigit(int number) {

		//int firstDigit = number % 10;
		
		int firstDigit = findFirstDigit(number);
		
		int result = (number - firstDigit) / 10;

		return result;

	}

}
