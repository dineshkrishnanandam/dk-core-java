package com.kan.beginnersbook.constructor;

public class JavaExample2 {

	static int num;
	static String mystr;

	// Second static block
	static {
		System.out.println("Static Block 2");
		num = 98;
		mystr = "Block2";
	}

	// First Static block
	static {
		System.out.println("Static Block 1");
		num = 68;
		mystr = "Block1";
	}

	public static void main(String args[]) {
		System.out.println("Value of num: " + num);
		System.out.println("Value of mystr: " + mystr);
	}

}
