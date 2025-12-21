package com.dex.codingchallenge;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int num, sum = 0;
		Scanner dex = new Scanner(System.in);
		System.out.print("Enter the Number=");
		num = dex.nextInt();
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			System.out.println("Given number is Perfect");
		} else {
			System.out.println("Given number is not Perfect");
		}
	}

}
