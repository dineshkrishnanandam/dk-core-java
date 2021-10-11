package com.kani.exception;

public class ExceptionDemo {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = 0; // initializing to 0 is a best practice

		try {
			//System.exit(0);

			// System.out.println("printing 3 element = " + args[2]); //
			// IndexOutOfBoundException iobe

			// b = Integer.parseInt(args[1]);

			b = convertStringToIntValue(args[1]);

			int c = a / b;
			System.out.println("c=" + c);

		} catch (ArithmeticException ae) {

			System.out.println("b=" + b);
			// System.out.println("Error=" + ae.getMessage());
			ae.printStackTrace();

		} catch (NumberFormatException nfe) { // Catching the error/exception thrown by JVM
			nfe.printStackTrace(); // Handling the error / exception
		} 
		catch (Exception e) {
		 System.out.println("Error = " + e.getMessage());
			e.printStackTrace();
			// Stack: Last In First Out LIFO
			// Queue: First In First Out

		} 
		finally {

			System.out.println("Iam in finally Block");

		}

		System.out.println("hooray");
		System.out.println("hooray");
		System.out.println("hooray");
		System.out.println("hooray");
	}
	
	public static int convertStringToIntValue(String stringValue) throws CharNotAllowedException {

		int intValue = 1;
		try {
			intValue = Integer.parseInt(stringValue);
		} catch (NumberFormatException nfe) {
//			System.out.println("Printing NFE************BEGIN");
//			nfe.printStackTrace();
//			System.out.println("Printing NFE************END");
		
			CharNotAllowedException cae = new CharNotAllowedException("Plese enter valid numeric value for b");
			throw cae;
		}
		System.out.println("I am going to return intValue of stringValue:" + stringValue);
		return intValue;
	}
}
