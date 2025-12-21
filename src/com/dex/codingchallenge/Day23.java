package com.dex.codingchallenge;

import java.util.Scanner;

public class Day23 {
	public static void main(String[] args) {
		Scanner dex = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = dex.nextInt();
		int newnum=0;
		if(num == 0)
		 newnum=1;
		 while(num>0)
		 {
		 int remain = num%10;
		 if(remain == 0)
		 remain = 1;
		 num = num/10;
		 newnum=newnum*10+remain;
		 }
		 num = 0 ;
		 while(newnum>0)
		 {
		 int r = newnum%10;
		 num= num*10 + r;
		 newnum =newnum / 10;
		 }
		 System.out.println("New Num : "+num);
		}
		}

