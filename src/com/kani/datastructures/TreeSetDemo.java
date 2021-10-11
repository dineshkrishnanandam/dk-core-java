package com.kani.datastructures;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<String> nameSet = new TreeSet<String>();

//		HashSet<String> nameSet = new HashSet<String>();
//		String name = new String("Kumaran");
//
//		nameSet.add(name);

		nameSet.add("Dinesh");
		nameSet.add("Kumaram");
		nameSet.add("Naveen");
		nameSet.add("Nila");
		nameSet.add("Kavin");
		nameSet.add("Jeeva");
//		nameSet.add("Jeeva");
		
		nameSet.add("D");
		nameSet.add("Dinesh");

		nameSet.add("B");
		nameSet.add("F");
		nameSet.add("A");
		nameSet.add("N");
		nameSet.add("Jeeva");
		System.out.println("Size of nameSet = " + nameSet.size());

		for (String s : nameSet) {

			System.out.println(s);
		}

	}
}
