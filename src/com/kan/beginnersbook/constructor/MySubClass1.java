package com.kan.beginnersbook.constructor;

public class MySubClass1 extends MySuperClass1 {
	void show() {
		System.out.println(" Show Method Is Called In MySubClass1 ");
	}

	void print() {
		System.out.println(" print Method Is Called In MySubClass1 ");
	}

	public static void main(String[] args) {

		// MySuperClass1 A1 = new MySubClass1();

		MySuperClass1 A1 = null;
		MySubClass1 B1 = new MySubClass1();
		A1 = B1;

//		MySuperClass1 A1 = new MySuperClass1();

		B1.show();
		A1.show();
		B1.print();

//		A1.print();

	}

}
