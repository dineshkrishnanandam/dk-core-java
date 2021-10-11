package com.kani.datastructures;

import java.util.HashSet;

import com.kani.polymorphism.PanasonicPlayer;

public class MyObjectsEqualsDemo {

	public static void main(String[] args) {

		PanasonicPlayer p1 = new PanasonicPlayer("PS10001", "China", 15000.50);
		System.out.println("Hashcode of p1: " + p1.hashCode());

		PanasonicPlayer p2 = new PanasonicPlayer("PS10002", "China", 16000.50);
		System.out.println("Hashcode of p2: " + p2.hashCode());

		PanasonicPlayer p3 = new PanasonicPlayer("PS10001", "Japan", 25000.50);
		System.out.println("Hashcode of p3: " + p3.hashCode());

		PanasonicPlayer p4 = new PanasonicPlayer("PS10001", "China", 15000.50);
		System.out.println("Hashcode of p4: " + p4.hashCode());

		System.out.println("p1 equals p4 : " + (p1.equals(p4)));

//		System.out.println("p1 == p3 : " + (p1 == p3));

//		System.out.println("p1 equals p3 : " + ( p1.equals(p3) ));

//		System.out.println("p1 equals p2 : " + ( p1.equals(p2) ));

		HashSet<PanasonicPlayer> panasonicPlayerSet = new HashSet<>();
		panasonicPlayerSet.add(p1);
		panasonicPlayerSet.add(p2); // p2.hashCode() == p1.hashCode() && p2.equals(p1)
		panasonicPlayerSet.add(p3); // p3.hashCode() == p2.hashCode() && p3.equals(p2) && p3.hashCode() == p1.hashCode() && p3.equals(p1)
		panasonicPlayerSet.add(p4);

		for (PanasonicPlayer pp : panasonicPlayerSet) {
			
			System.out.println(pp);

		}
	}

}
