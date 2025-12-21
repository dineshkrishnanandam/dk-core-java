package com.dex.codingchallenge;

import java.util.Scanner;

public class SumOfPrimeProgram {

	public static void main(String[] args) {
	
		
		      int inpt, i;
		      boolean temp= false;
		      inpt = 43;
		      
		      Scanner dex = new Scanner(System.in);
		    
		      System.out.print("Enter the number : ");
		      inpt = dex.nextInt();
		      
		      for (i = 2; i <= inpt / 2; ++i) {
		         if (IsPrime(i)) {
		            if (IsPrime(inpt - i)) {
		         
		               System.out.printf("%d = %d + %d", inpt, i, inpt - i);
		               temp = true;
		             }
		         }
		      }
		      if (!temp)
		         System.out.println(inpt + " cannot be expressed as the sum of two prime numbers.");
		   }
		   static boolean IsPrime(int num) {
		      boolean my_prime = true;
		      for (int i = 2; i <= num / 2; ++i) {
		         if (num % i == 0) {
		            my_prime = false;
		            break;
		          }
		      }
		      return my_prime;
		   }
		}
	
