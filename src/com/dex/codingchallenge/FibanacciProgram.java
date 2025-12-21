package com.dex.codingchallenge;

import java.util.Scanner;

public class FibanacciProgram {

	public static void main(String[] args) {

		  int num, a = 0, b = 0, c = 1;
		  
        Scanner dex = new Scanner(System.in);
        
        System.out.print("Enter value of num:");
        
        num = dex.nextInt();
        
        System.out.print("Fibonacci Series:");
        
        for(int i = 1; i <= num; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }

	}


