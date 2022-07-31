package com.kan.beginnersbook.constructor;

public class ParaConst {
	int a;
	String b;
	double salary;

	ParaConst() {
		this.a = -1;
		this.b = "Kumaran";
		this.salary = -1000;
	}

	ParaConst(int id, String name) {
		this.a = id;
		this.b = name;
		this.salary = -1000;    

	}

	ParaConst(int id, String name, double salary) {
		this.a = id;
		this.b = name;
	//this(id, name);
		this.salary = salary;

	}

	void info() {
		System.out.println("Id: " + a + "Name: " + b + "salary: " + salary);
	}

	void info(String objName) {
		System.out.println("myObjectname:  " + objName + "Id: " + a + " Name: " + b + " salary: " + salary);
	}

	public static void main(String args[]) {
		ParaConst obj1 = new ParaConst(10245, "Chaitanya");
		ParaConst obj2 = new ParaConst(92232, "Negan");
		ParaConst obj3 = new ParaConst();
		ParaConst obj4 = new ParaConst();
		ParaConst obj5 = new ParaConst(25636, "gokul", 5000);
		ParaConst obj6 = new ParaConst(25, "naveen", 6789);

		obj1.info();
		obj2.info();
		obj3.info();
		obj4.info();
		obj5.info();
		obj6.info("object6");

	}
}
