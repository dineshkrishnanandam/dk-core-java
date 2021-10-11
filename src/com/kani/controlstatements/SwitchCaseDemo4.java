package com.kani.controlstatements;

public class SwitchCaseDemo4 {

	public static void main(String[] args) {
		System.out.println("main - BEGIN");
		System.out.println();

		int number = 452345345;

		int firstDigit = DigitFinder.findFirstDigit(number);
		String numberToString = switchCaseMethod(firstDigit);
		System.out.println("firstDigit in English = " + numberToString);
		
		String remaingNumberToString = "";
		
		int numberWithoutFirstDigit = DigitFinder.findNumberWithoutFirstDigit(number);
		
		while(numberWithoutFirstDigit >= 10) {
		
			
			firstDigit = DigitFinder.findFirstDigit(numberWithoutFirstDigit);
			numberToString = switchCaseMethod(firstDigit);
			System.out.println("firstDigit in English = " + numberToString);
			
			numberWithoutFirstDigit = DigitFinder.findNumberWithoutFirstDigit(numberWithoutFirstDigit);
			
			remaingNumberToString = switchCaseMethod(numberWithoutFirstDigit);
			
			if(numberWithoutFirstDigit < 10) {
				numberToString = switchCaseMethod(numberWithoutFirstDigit);
				System.out.println("firstDigit in English = " + numberToString);
			}
			
			
		}
		
		
		
//		System.out.println("Given number is " + number);
//		System.out.println("firstDigit in English = " + numberToString);
//		System.out.println("remaining number in english = " + remaingNumberToString);
		
		
//		for (int i = 0; i <= number; i++) {
//
//			String numberInEnglish = switchCaseMethod(i);
//			System.out.println(i + "=" + numberInEnglish);
//		}

		System.out.println();
		System.out.println("main - END");

	}

	public static String switchCaseMethod(int number) {

		String numberToLetter = "";

		switch (number) {

		case 0:
			numberToLetter = "Zero";
			break;
		case 1:
			numberToLetter = "One";
			break;
		case 2:
			numberToLetter = "Two";
			break;
		case 3:
			numberToLetter = "Three";
			break;
		case 4:
			numberToLetter = "Four";
			break;
		case 5:
			numberToLetter = "Five";
			break;
		case 6:
			numberToLetter = "Six";
			break;

		case 7:
			numberToLetter = "Seven";
			break;

		case 8:
			numberToLetter = "Eight";
			break;

		case 9:
			numberToLetter = "Nine";
			break;

		default:
			numberToLetter = "I don't know";

		}

//		System.out.println(numberToLetter);
		return numberToLetter;
	}

}
