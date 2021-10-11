package com.kan.beginnersbook.constructor;

public class Demo {
	int a;
	int b;
	int c;

	Demo(int x, int y) {
		this.a = x;
		this.b = y;
		this.add();
		this.print();
	}

	void add() {
		c = a + b;

	}

	void print() {
		System.out.println("total= " + c);
	}

//	//public Demo() {
//		System.out.println("This is a no argument constructor");
//	}

	public static void main(String args[]) {
		// new Demo();
		 new Demo(2, 3);
//		obj1.add();
//		obj1.print();

	}

}
