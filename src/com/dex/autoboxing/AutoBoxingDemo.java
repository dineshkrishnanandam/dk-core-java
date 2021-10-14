package com.dex.autoboxing;

public class AutoBoxingDemo {

	public static void main(String[] args) {
//    int i =10;
//		Integer age = new Integer(10);
//		Integer age = Integer.valueOf(10);
		//Autoboxing
		Integer age = 10;
     // A a1 = new B(); 
		// a1 is the reference variable of type class A
		// a1 can hold the reference value of an object of class A or object of  sub classes of A
		System.out.println("age :" + age.intValue());
		//Auto unboxing
		int x = age;
		
		//Immutable Classes 
		Integer rollNumber = Integer.valueOf(9876);
		rollNumber = rollNumber + 10 ;
		
		String s1 = "Kumaran";
		s1 = s1 + " Sivapunniyam";
		
		
		System.out.println(s1);
//		Float 
//		Double
//		Long
//		Boolean
//		Charactor
//		Byte
//		
		
		String s3 = "xyz";
		
		int y3  = Integer.parseInt(s3);
		int z3 = Integer.valueOf(s3);
		
		
	}

}
