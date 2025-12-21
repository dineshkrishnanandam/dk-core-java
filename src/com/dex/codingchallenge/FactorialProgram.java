package com.dex.codingchallenge;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		Scanner dex = new Scanner(System.in);
		int fact = 1;
		System.out.println("Enter the number==");

		int num = dex.nextInt();

		for (int i = num; i >= 1; i--) {

			fact = fact * i;
		}

		System.out.println("Factorial of given number==" + fact);
	}
}
