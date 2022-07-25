package com.dex.string;

public class SubStringDemoOne {

	public static void main(String[] args) {
		String d1 = "Dell inspiron is my fav lap ";
		String d2 = "inspiron";
		String d3 = "alienware";
		String res = "";
		int i;

		do {
			System.out.println(d1);
			i = d1.indexOf(d2);
			if (i != -1) {
				res = d1.substring(0, i);
				res = res + d3;
				res = res + d1.substring(i + d2.length());
				d1 = res;
			}
		} while (i != -1);
	}
}
