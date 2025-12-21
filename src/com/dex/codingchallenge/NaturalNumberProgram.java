package com.dex.codingchallenge;

import java.util.Scanner;

public class NaturalNumberProgram {

	public static void main(String[] args) {
		
			Scanner dex = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int num = dex.nextInt();
			int sum= 0;
			for(int i=0;i<=num;i++)
			sum = sum + i;
			System.out.print(sum);
	}

}
