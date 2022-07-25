package com.dex.string;

public class EqualsDemoOne {

	public static void main(String[] args) {

		String d1 = "dinesh";
		String d2 = "dinesh";
		String d3 = "krishna lakshmi";
		String d4 = "DINESH";

		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		System.out.println(d1.equals(d4));
		System.out.println(d1.equalsIgnoreCase(d4));

	}

}
