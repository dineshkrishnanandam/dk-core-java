package com.kani.datastructures;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<String, String> addressBook = new TreeMap<>();

		addressBook.put("Kumaran", "qwer4321");
		addressBook.put("Dinesh", "zxcv323");
		addressBook.put("Naveen", "tyui321");
		addressBook.put("Kavin", "tujh267890");
		
		addressBook.put("X", "qwer123");
		addressBook.put("Y", "zxcv323");
		addressBook.put("A", "tyui321");
		addressBook.put("Kavin", "tr  h7654321");
//		addressBook.put("Kavin", "tr  h7654321");

		// Map stores the data Key - Value pair model

		Set<String> ks = addressBook.keySet();
		for (String s : ks) {

			System.out.println(s + " : " + addressBook.get(s));
		}

//		PanasonicPlayer p1 = new PanasonicPlayer("PS10001", "China", 15000.50);
//
//		PanasonicPlayer p2 = new PanasonicPlayer("PS10002", "China", 16000.50);
//
//		PanasonicPlayer p3 = new PanasonicPlayer("PS10001", "Japan", 25000.50);
//
//		PanasonicPlayer p4 = new PanasonicPlayer("PS10001", "China", 17000.50);
//
//		HashMap<String, PanasonicPlayer> panasonicPlayerMap = new HashMap<>();
//
//		panasonicPlayerMap.put("PS10001", p1);
//		panasonicPlayerMap.put("PS10002", p2);
//		panasonicPlayerMap.put("PS10001", p3);
//		// panasonicPlayerMap.put("PS10001", p4);
//
//		System.out.println(panasonicPlayerMap.get("PS10001"));
	}

}
