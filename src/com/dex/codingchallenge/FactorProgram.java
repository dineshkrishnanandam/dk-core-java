package com.dex.codingchallenge;

import java.util.Scanner;

public class FactorProgram {

	public static void main(String[] args) {

		int num;
	      
	      Scanner dex = new Scanner(System.in);
	  
	      System.out.print("Enter the number : ");
	      
	      num = dex.nextInt();
	      
	      System.out.print("The factors  are: ");
	      
	      for (int i = 1; i <= num; i++) {
	         if (num % i == 0) {
	            System.out.print(i + " ");
	         }
	      }
	   }
	}


