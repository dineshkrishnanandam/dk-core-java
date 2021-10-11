package com.kani.regex;

import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
		System.out.println("by character classes and quantifiers ...");  
		
		//System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true  
		
		//System.out.println(Pattern.matches("[0-9]{11}5", "502273928054"));//true  
		
		System.out.println(Pattern.matches("123456789012|123456789013", "123456789014"));//true  
//		  
//		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)  
//		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)  
//		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true  
//		  
//		System.out.println("by metacharacters ...");  
//		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true  
//		System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3)  
		  
		
//		System.out.println(Pattern.matches("[amn]", "abcd"));// false (not a or m or n)
//		System.out.println(Pattern.matches("[amn]", "a"));// true (among a or m or n)
//		System.out.println(Pattern.matches("[amn]", "ammmna"));// false (m and a comes more than once)
	}
}