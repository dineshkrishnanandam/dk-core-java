package com.dex.string;

public class IndexOfDemo {

	public static void main(String[] args) {

		String d = "Dell Inspiron is my fav lap";
		System.out.println(d.indexOf(' '));
		System.out.println(d.indexOf('D'));
		System.out.println(d.indexOf("lap"));
		System.out.println(d.indexOf('l'));
		System.out.println(d.lastIndexOf('l'));

	}

}
