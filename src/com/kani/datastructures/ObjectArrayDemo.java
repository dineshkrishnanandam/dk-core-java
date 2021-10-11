package com.kani.datastructures;

import com.kani.polymorphism.*;

public class ObjectArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] stringArray = new String[5];
		stringArray[0] = "Dinesh0";
		stringArray[1] = "Dinesh1";
		stringArray[2] = "Dinesh2";
		stringArray[3] = "Dinesh3";
		stringArray[5] = "Dinesh4";
	
		Player[] playerArray = new Player[5];
		playerArray[0] = new SonyPlayer();
		playerArray[1] = new SonyPlayer();
		//playerArray[2] = new PanasonicPlayer();
		playerArray[3] = new SonyPlayer(); //after line 24, object that was stored earlier in playerArray[3] will become eligible for Garbage Collection
		playerArray[4] = new SonyPlayer();
		
		playerArray[3] = null;
		//after line 24, object that was stored earlier in playerArray[3] will become eligible for Garbage Collection
		
		
		

	}

}
