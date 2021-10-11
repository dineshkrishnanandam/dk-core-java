package com.kan.beginnersbook.constructor;

public class MyParentClass {
	
	private String name;
	
	private String rollNumber;
	
	

	MyParentClass() {
		//System.out.println("this is my parent constructor");
		// this.print();
	}
	
	public MyParentClass(String name, String rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}



	MyParentClass(String name) {
		System.out.println("Name: " + name);
	}

	private void print() {
		System.out.println(" print method is created");
	}

//	public static void main(String args[]) {
//
//		MyParentClass obj2 = new MyParentClass();
////		obj2.print();
//		
//		System.out.println("name=" + obj2.name);
//	}
}
