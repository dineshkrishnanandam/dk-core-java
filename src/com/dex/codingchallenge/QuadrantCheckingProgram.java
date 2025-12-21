package com.dex.codingchallenge;

import java.util.Scanner;

public class QuadrantCheckingProgram {

	public static void main(String[] args) {
		Scanner dex = new Scanner(System.in);
		int x = dex.nextInt();
		int y = dex.nextInt();

		if (x > 0 && y > 0) {
			System.out.println("First Quadrant");

		} else if (x < 0 && y > 0) {
			System.out.println("Second Quadrant");

		} else if (x < 0 && y < 0) {
			System.out.println("Third Quadrant");

		} else if (x > 0 && y < 0) {
			System.out.println("Fourh Quadrant");

		} else {
			System.out.println("Orgin");
		}

	}

}
