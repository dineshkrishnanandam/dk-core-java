package com.kan.beginnersbook.constructor;

public class ParaCon {
	int a;
	String b;
	double salary;

	ParaCon() {
		this.a = -1;
		this.b = "Kumaran";
		this.salary = -1000;
	}

	ParaCon(int id, String name) {
		this.a = id;
		this.b = name;
		this.salary = -1000;    

	}

	ParaCon(int id, String name, double salary) {
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
		ParaCon obj1 = new ParaCon(10245, "Chaitanya");
		ParaCon obj2 = new ParaCon(92232, "Negan");
		ParaCon obj3 = new ParaCon();
		ParaCon obj4 = new ParaCon();
		ParaCon obj5 = new ParaCon(25636, "gokul", 5000);
		ParaCon obj6 = new ParaCon(25, "naveen", 6789);

		obj1.info();
		obj2.info();
		obj3.info();
		obj4.info();
		obj5.info();
		obj6.info("object6");

	}
}
