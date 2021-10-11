package com.kani.datastructures;

import java.util.HashMap;

import com.kani.polymorphism.PanasonicPlayer;

public class MapDemo {

	public static void main(String[] args) {

		HashMap<String, String> addressBook = new HashMap<>();

		addressBook.put("Kumaran", "qwer4321");
		addressBook.put("Dinesh", "zxcv323");
		addressBook.put("Naveen", "tyui321");
		addressBook.put("Kavin", "lopijh267890");
		addressBook.put("Kavin", "bhi765");
		
		System.out.println(addressBook.get("Kavin"));
		System.out.println(addressBook.get("Dinesh"));

		
		
		//Map stores the data Key - Value pair model
		
		System.out.println(addressBook.get("Naveen"));
		
		PanasonicPlayer p1 = new PanasonicPlayer("PS10001", "China", 15000.50);
		System.out.println("Hashcode of p1: " + p1.hashCode());

		PanasonicPlayer p2 = new PanasonicPlayer("PS10002", "China", 16000.50);
		System.out.println("Hashcode of p2: " + p2.hashCode());

		PanasonicPlayer p3 = new PanasonicPlayer("PS10001", "Japan", 25000.50);
		System.out.println("Hashcode of p3: " + p3.hashCode());

		PanasonicPlayer p4 = new PanasonicPlayer("PS10001", "China", 15000.50);
		System.out.println("Hashcode of p4: " + p4.hashCode());
		
		HashMap<String, PanasonicPlayer> panasonicPlayerMap = new HashMap<>();
		
		panasonicPlayerMap.put("PS10001", p1);
		panasonicPlayerMap.put("PS10002", p2);
		panasonicPlayerMap.put("PS10001", p3);
//		panasonicPlayerMap.put("PS10001", p4);
		
		System.out.println(panasonicPlayerMap.get("PS10001"));
	}

}
