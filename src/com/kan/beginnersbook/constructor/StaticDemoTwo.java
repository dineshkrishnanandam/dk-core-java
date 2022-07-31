package com.kan.beginnersbook.constructor;

public class StaticDemoTwo {

	static int i = 100;
	static String s = "Beginnersbook";

	// Static method
	static void display() {
		System.out.println("static i:" + i);
		System.out.println("static Stringi:" + s);
	}

	// non-static method
	void funcn() {
		// Static method called in non-static method
		System.out.println("non-static i:" + i);
		System.out.println("non-static Stringi:" + s);
		
//		display();  
	}

	// static method
	public static void main(String args[]) {
		StaticDemoTwo obj = new StaticDemoTwo();
		// You need to have object to call this non-static method
		obj.funcn();
		System.out.println();


		// Static method called in another static method
		display();
	}

}
