package com.dex.codingchallenge;

import java.util.Scanner;

public class LowerToUpper {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the string");
		String s1 = "";
		String s;
		Scanner dex = new Scanner(System.in);
		s = dex.nextLine();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) {
				s1 = s1 + Character.toLowerCase(ch);
			} else {
				s1 = s1 + Character.toUpperCase(ch);
			}
		}
		System.out.println(s1);
	}

}
