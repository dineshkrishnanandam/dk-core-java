package com.dex.codingchallenge;

import java.util.Scanner;

public class RemVov {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the string");
		String s1="";
		String s;
		Scanner dex = new Scanner(System.in);
		s = dex.nextLine();
	
		for(int i=0;i<s.length();i++){
		 char ch=s.charAt(i);
		 if(!(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'|| ch=='u'||ch=='A'||
		ch=='E'||ch=='I'|| ch=='O'|| ch=='U'))
		 {
		 s1=s1+ch+"";
		 }
		}
		 System.out.println(s1);
		}
		}

	
