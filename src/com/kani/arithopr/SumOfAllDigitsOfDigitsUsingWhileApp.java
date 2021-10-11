package com.kani.arithopr;

public class SumOfAllDigitsOfDigitsUsingWhileApp {

	public static void main(String[] args) {
		
		int num = 54321;
		
		System.out.println("Given number = " + num);
		
		int sum = 0;
		int firstDigit = 0;
		
		while(num != 0) {

			while(num != 0 ) {
				
				firstDigit = num % 10;
				sum = sum + firstDigit;
				
				num = (num - firstDigit) / 10;
			}
			if(sum >= 10) {
				num = sum;
				sum = 0;
			}
			
		}

		System.out.println("sum of all digits of digits = " + sum);
	}

}
