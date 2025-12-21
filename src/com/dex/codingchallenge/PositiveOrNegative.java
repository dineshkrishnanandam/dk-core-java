package com.dex.codingchallenge;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {

		System.out.println("Enter the Number ");
		Scanner dex = new Scanner(System.in);
		int z = dex.nextInt();
		if (z >= 1) {
			System.out.println("Given Num is Positive");
		} else if (z == 0) {
			System.out.println("Given num is Neither Positive nor Negative");
		} else {
			System.out.println("Given Num is Negative");

		}
	}

}
