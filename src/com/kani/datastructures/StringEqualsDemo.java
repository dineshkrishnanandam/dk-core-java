package com.kani.datastructures;

public class StringEqualsDemo {

	public static void main(String[] args) {
		
		
//		PanasonicPlayer p1 = new PanasonicPlayer("PS10001", "China", 15000.50);
//		System.out.println("Hashcode of p1: " + p1.hashCode());
//		
//		PanasonicPlayer p2 = new PanasonicPlayer("PS10002", "China", 16000.50);
//		System.out.println("Hashcode of p2: " + p2.hashCode());
//		
		//encryption, decryption
		
		//String Pool
		String d1 = "Dinesh"; //d1 goes to string-pool
		String s1 = "Kumaran"; //s1 goes to string-pool
		String s2 = "Kumaran"; //s2 - Java uses the same object from the pool
		
		//
		String s3 = new String("Kumaran");
		String s4 = new String("Kumaran");
		
		System.out.println("HashCode of d1: " + d1.hashCode());
		System.out.println("HashCode of s1: " + s1.hashCode());
		System.out.println("HashCode of s2: " + s2.hashCode());
		System.out.println("HashCode of s3: " + s3.hashCode());
		
//		if(s1 == s2) {
//			System.out.println("s1 and s2 are equal");
//		}
//		
//		if(s1 == s3) {
//			System.out.println("s1 and s3 are equal");
//		}
//		else {
//			System.out.println("s1 and s3 are not equal");
//		}
//		

		if(s3 == s4) {
			System.out.println("==  s3 and s4 are equal");
		}
		else {
			System.out.println("== s3 and s4 are not equal");
		}
		
		
		if(s3.equals(s4)) {
			System.out.println("equals: s3 and s4 are equal");
		}
		else {
			System.out.println("equals: s3 and s4 are not equal");
		}
	}

}
