package com.dex.codingchallenge;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		System.out.println("Enter the Given Number");
		
		Scanner dex = new Scanner(System.in);

		int z = dex.nextInt();

		if (z % 2 == 0) {
			System.out.println("Given num is Even ");
		} else {
			System.out.println("Given num is Odd ");
		}
	}

}
