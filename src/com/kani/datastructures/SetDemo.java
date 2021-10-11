package com.kani.datastructures;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {

		HashSet<String> nameSet = new HashSet<String>();

//		HashSet<String> nameSet = new HashSet<String>();
		String name = new String("Kumaran");

//		nameSet.add(name);
//		nameSet.contains(name);
		nameSet.add("Dinesh0");
		nameSet.add("Dinesh1");
		nameSet.add("Dinesh2");
		nameSet.add("Dinesh3");
		nameSet.add("Dinesh4");
		nameSet.add("Dinesh5");
		nameSet.add("Dinesh6");
		nameSet.add("Dinesh7");
		nameSet.add("Dinesh2");
		nameSet.add("Dinesh3");
		nameSet.add("Dinesh8");
		//nameSet.contains("Kumaran");
		boolean b = nameSet.contains("Dinesh2");
		System.out.println("B :" +b);
				
		System.out.println("Size of nameSet = " + nameSet.size());

		for (String s : nameSet) {

			System.out.println(s);
		}

//		for (int i = 0; i < nameSet.size(); i++) {
//			System.out.println(nameSet.get(i));
//		}

	}
}
