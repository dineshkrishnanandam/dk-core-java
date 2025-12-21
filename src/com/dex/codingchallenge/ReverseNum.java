package com.dex.codingchallenge;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num, rNum;
		Scanner dex = new Scanner(System.in);
		
	      num = dex.nextInt();
	      while(num>0)
	      {
	    	  rNum=num%10;
	    	  System.out.print(rNum);
	    	  num=num/10;
	      }
	}
	
	

}
