package com.dex.codingchallenge;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
	System.out.println("Enter The string");
	 String s1="";
	 String s;
	 Scanner dex = new Scanner(System.in);
	 s = dex.nextLine();
	 System.out.println("original string = "+s);
	 for(int i=0;i<s.length();i++){
	 char ch=s.charAt(i);
	 s1=ch+s1;
	}
	System.out.println("reverse string = "+s1);
	 if(s.equals(s1)){
	 System.out.println("String is palindrome");
	}
	else{
	 System.out.println("String is not palindrome");
	}

	}
	}

