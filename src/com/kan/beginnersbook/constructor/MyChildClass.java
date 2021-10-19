package com.kan.beginnersbook.constructor;

public class MyChildClass extends MyParentClass {

	MyChildClass() {
//		super();
		 super("dinesh");
		System.out.println("this is child Noarg-constructor");
		// this.show();
	}

	void show() {
		System.out.println(" show method is created ");
	}

	public static void main(String args[]) {
		// new MyChildClass();
		MyChildClass obj1 = new MyChildClass();
//		MyParentClass obj2 = new MyParentClass("Japan");
//		obj1.show();
//		obj2.print();

//		obj1.print();
//		obj2.print();
	}

}
