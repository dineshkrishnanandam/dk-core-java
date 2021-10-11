package com.kani.exception;

public class CharNotAllowedException extends Exception {
	
	
	public CharNotAllowedException(String b) {

		super( b);

	}
	
	

	public static void main(String[] args)
	{
		
		CharNotAllowedException obj1 = new CharNotAllowedException("String or Char Not Allowed");
		
		System.out.println(obj1.getMessage())	;	
	}

}
