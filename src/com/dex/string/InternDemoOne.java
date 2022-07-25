package com.dex.string;

public class InternDemoOne {

	public static void main(String[] args) {
		String d1 = "dellinspiron";
		String d2 = d1.intern();
		String d3 = new String("dellinspiron");
		String d4 = d3.intern();
		System.out.println(d1 == d2); // True
		System.out.println(d1 == d3); // False
		System.out.println(d1 == d4); // True
		System.out.println(d2 == d3); // False
		System.out.println(d2 == d4); // True
		System.out.println(d3 == d4); // False
	}

}
