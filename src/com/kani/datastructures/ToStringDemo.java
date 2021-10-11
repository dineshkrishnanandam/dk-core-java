package com.kani.datastructures;

import com.kani.polymorphism.PanasonicPlayer;

public class ToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PanasonicPlayer p1 = new PanasonicPlayer("PS10001", "China", 15000.50);
		p1.play();
		
		
//		String s = p1.toString();
//		System.out.println(s);
		
		//toString gets called by default
		System.out.println(p1);
	}
	


}
