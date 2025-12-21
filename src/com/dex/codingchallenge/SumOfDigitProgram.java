package com.dex.codingchallenge;

import java.util.Scanner;

public class SumOfDigitProgram {

	public static void main(String[] args) {

		long num, sum;
		Scanner dex = new Scanner(System.in);

		System.out.print("Enter a number ");

		num = dex.nextLong();

		for (sum = 0; num != 0; num = num / 10) {

			sum = sum + num % 10;
		}

		System.out.println("Sum of digits " + sum);
	}

}
