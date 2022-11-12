package com.dex.string;

public class MainStringDemo {

	public static void main(String[] args) {
		String s1 = "Kumaran";
		// Appending

		s1 = s1 + "Jeeva";
		s1 = s1 + "Lakshmi";
		s1 = s1 + "Naveen";
		System.out.println(s1);
		System.out.println();

		// All methods in StringBuffer are synchronized
		// Muttable classes
		StringBuffer sb = new StringBuffer();
		sb.append("Kumaran");
		sb.append("Jeeva");
		sb.append("Lakshmi");
		sb.append("Naveen");
<<<<<<< Updated upstream
		System.out.println("StringBuffer = "+sb);
		System.out.println();

		// All methods in StringBuilder are non-synchronized
=======
		System.out.println("StringBuffer = " +sb);
		
		// All methods in StringBuilder are non-synchronized 
>>>>>>> Stashed changes
		// StringBuilder is preferable Single-Thread
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Kumaran");
		sb1.append("Jeeva");
		sb1.append("Lakshmi");
		sb1.append("Naveen");
<<<<<<< Updated upstream
		System.out.println("StringBuilder = "+sb1.toString());
		System.out.println();
=======
		System.out.println("StringBuilder = " + sb1.toString());
		
		System.out.println("StringBuilder = " +sb1.reverse());
		
		System.out.println("StringBuilder = " +sb1.replace(5, 8, " "));
>>>>>>> Stashed changes

		System.out.println("StringBuilder = "+sb1.reverse());
		System.out.println();

		System.out.println("StringBuilder = "+sb1.replace(5, 8, " "));
		System.out.println();

	}

}
