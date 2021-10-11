package com.kani.datastructures;

import java.util.ArrayList;

import com.kani.polymorphism.PanasonicPlayer;
import com.kani.polymorphism.SonyPlayer;

public class ListDemo {

	public static void main(String[] args) {

//		String[] stringArray = new String[5];
//		stringArray[0] = "Dinesh0";
//		stringArray[1] = "Dinesh1";
//		stringArray[2] = "Dinesh2";
//		stringArray[3] = "Dinesh3";
//		stringArray[4] = "Dinesh4";

		ArrayList nameList = new ArrayList();

		String name = new String("Harry");

		nameList.add(name);
		nameList.add("Dinesh0");
		nameList.add("Dinesh1");
		nameList.add("Dinesh2");
		nameList.add("Dinesh3");
		nameList.add("Dinesh4");
		nameList.add("Dinesh5");
		nameList.add("Dinesh6");
		nameList.add("Dinesh7");
		nameList.add(new SonyPlayer());
		nameList.add(new PanasonicPlayer(name, name, 0));

		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}
//		Player[] playerArray = new Player[5];
//		playerArray[0] = new SonyPlayer();
//		playerArray[1] = new SonyPlayer();
//		playerArray[2] = new PanasonicPlayer();
//		playerArray[3] = new SonyPlayer(); //after line 24, object that was stored earlier in playerArray[3] will become eligible for Garbage Collection
//		playerArray[4] = new SonyPlayer();
//		
//		playerArray[3] = null;
//		//after line 24, object that was stored earlier in playerArray[3] will become eligible for Garbage Collection

	}

}
