package com.kani.datastructures;

import com.kani.polymorphism.PanasonicPlayer;

public class MyObjectsEqualsSetDemo {

	public static void main(String[] args) {

		PanasonicPlayer p1 = new PanasonicPlayer("PS10001", "China", 15000.50);
		System.out.println("Hashcode of p1: " + p1.hashCode());

//		PanasonicPlayer p2 = new PanasonicPlayer("PS10002", "China", 16000.50);
//		System.out.println("Hashcode of p2: " + p2.hashCode());
//
//		PanasonicPlayer p3 = new PanasonicPlayer("PS10001", "Japan", 25000.50);
//		System.out.println("Hashcode of p3: " + p3.hashCode());
		
		
		PanasonicPlayer p4 = new PanasonicPlayer("PS10001", "China", 15000.50);
		System.out.println("Hashcode of p4: " + p4.hashCode());

		System.out.println("p1 equals p4 : " + ( p1.equals(p4) ));
		
		
//		System.out.println("p1 == p3 : " + (p1 == p3));
		
//		System.out.println("p1 equals p3 : " + ( p1.equals(p3) ));
		
//		System.out.println("p1 equals p2 : " + ( p1.equals(p2) ));

	}

}
