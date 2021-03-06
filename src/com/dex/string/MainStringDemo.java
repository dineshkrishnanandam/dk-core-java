package com.dex.string;

public class MainStringDemo {

	public static void main(String[] args) {
		String s1 = "Kumaran";
		// Appending

		s1 = s1 + "Jeeva";
		s1 = s1 + "Lakshmi";
		s1 = s1 + "Naveen";
		System.out.println(s1);
		
		// All methods in StringBuffer are synchronized
		// Muttable classes
		StringBuffer sb = new StringBuffer();
		sb.append("Kumaran");
		sb.append("Jeeva");
		sb.append("Lakshmi");
		sb.append("Naveen");
		System.out.println(sb);
		
		// All methods in StringBuilder are non-synchronized 
		// StringBuilder is preferable Single-Thread
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Kumaran");
		sb1.append("Jeeva");
		sb1.append("Lakshmi");
		sb1.append("Naveen");
		System.out.println(sb1.toString());
		
		System.out.println(sb1.reverse());
		
		System.out.println(sb1.replace(5, 8, " "));



	}

}
