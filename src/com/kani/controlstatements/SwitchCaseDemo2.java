package com.kani.controlstatements;

public class SwitchCaseDemo2 {

	public static void main(String[] args) {
		System.out.println("main - BEGIN");
		System.out.println();

		String numberInEnglish = switchCaseMethod(10);
		System.out.println(numberInEnglish);

//		switchCaseMethod(8);
//		System.out.println();
//		
//		switchCaseMethod(4);
//		
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
