package com.kani.controlstatements;

public class IfDemo {

	public static void main(String[] args) {

		//ifElseMethod();
		multipleIfElseMethod();

	}

	public static void ifElseMethod() {
		int number = 10;

		if ((number % 2) == 0) {

			System.out.println("Given number is an even number");
		} else {

			System.out.println("Given number is a odd number");

		}

	}

	public static void multipleIfElseMethod() {
		int number = 2;

		String numberToLetter = "I don't know";

		if (number == 0) {
			
			numberToLetter = "Zero";
		
		} else if (number == 1) {
		
			numberToLetter = "One";
		
		} else if (number == 2) {
		
			numberToLetter = "Two";
		
		} else if (number == 3) {
			
			numberToLetter = "Three";
		
		} else if (number == 4) {
		
			numberToLetter = "Four";
		
		} else if (number == 5) {
		
			numberToLetter = "Five";
		
		}

		System.out.println(numberToLetter);
	}

}
