package com.dex.string;

public class SplitDemoOne {

	public static void main(String[] args) {
		String name = "oneplus#nord";
		String[] namesep = name.split("#", 2);

		for (String a : namesep)
			System.out.println(a);
	}

}
