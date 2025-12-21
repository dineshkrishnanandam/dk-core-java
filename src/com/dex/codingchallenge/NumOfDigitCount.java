package com.dex.codingchallenge;

import java.util.Scanner;

public class NumOfDigitCount {

	public static void main(String[] args) {
          
		Scanner dex = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter the Num:");
		int num = dex.nextInt();
		
		 while(num!=0){
	         num = num/10;
	         count++;
	      }
		 System.out.println(count);
	}
}
