package com.kan.beginnersbook.constructor;

public class JavaExample3 {

	static int i = 100;
	static String s = "Beginnersbook";

	// Static method
	static void display() {
		System.out.println("i:" + i);
		System.out.println("i:" + s);
	}

	// non-static method
	void funcn() {
		// Static method called in non-static method
		display();
	}

	// static method
	public static void main(String args[]) {
		JavaExample3 obj = new JavaExample3();
		// You need to have object to call this non-static method
		obj.funcn();

		// Static method called in another static method
		display();
	}

}
