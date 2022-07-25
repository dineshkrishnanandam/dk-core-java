package com.dex.string;

public class GetCharsDemoOne {

	public static void main(String[] args) {

		String d = "Dell Inspiron is my fav lap";
		int a = 5;
		int b = 13;
		char buf[] = new char[b - a];

		d.getChars(a, b, buf, 0);
		System.out.println(buf);

	}

}
