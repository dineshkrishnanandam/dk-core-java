package com.kan.beginnersbook.constructor;

public class MyParentClass {

	private String name;

	private int rollNumber;

	MyParentClass() {
		System.out.println("ParentClass No-Arg constructor is invoked ");

		// System.out.println("this is my parent constructor");
		// this.print();
	}

	public MyParentClass(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}

	MyParentClass(String name) {
		System.out.println("Name: " + name);
	}
	
	MyParentClass(int rollNumber) {
		System.out.println("rollNumber: " + rollNumber);
		print();
	}

	public void print() {
		System.out.println(" print method is created");
	}
	
//	public  void print() {
//		System.out.println(" print method is created");
//	}

//	public static void main(String args[]) {
//
//		MyParentClass obj2 = new MyParentClass();
////		obj2.print();
//		
//		System.out.println("name=" + obj2.name);
//	}
}
