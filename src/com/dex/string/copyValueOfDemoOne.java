package com.dex.string;

public class copyValueOfDemoOne {

	public static void main(String[] args) {

		char[] d1 = { 'i', 'r', 'i', 's' };
		String d2 = "";
		d2 = d2.copyValueOf(d1, 0, 4);
		System.out.println("Returned String: " + d2);
	}

}
