package com.kani.datastructures;

import java.util.HashSet;

import com.kani.polymorphism.PanasonicPlayer;

public class SetDemo2 {

	public static void main(String[] args) {

		HashSet<String> nameSet = new HashSet<String>();

		HashSet< PanasonicPlayer> playerSet = new HashSet<PanasonicPlayer>();
		
		String name = new String("Kumaran");

		nameSet.add(name);
		nameSet.add("Dinesh0");
		nameSet.add("Dinesh123");
		nameSet.add("Dinesh23344");
		nameSet.add("Dinesh3");
		nameSet.add("Dinesh4");
		nameSet.add("Dinesh5");
		nameSet.add("Dinesh6");
		nameSet.add("Dinesh7");
		nameSet.add("Dinesh2");
		nameSet.add("Dinesh3");
		//nameSet.add(null);
//		playerSet.add(null);
		
	
		
		

		System.out.println("Size of nameSet = " + nameSet.size());

		for (String s : nameSet) {

			System.out.println(s + " : " + s.length());
		}

	}

}
