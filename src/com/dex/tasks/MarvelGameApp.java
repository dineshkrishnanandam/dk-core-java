package com.dex.tasks;

public class MarvelGameApp {

	public static void main(String[] args) {

//		MarvelHeros bravo =new MarvelHeros();

		MarvelHeros bravo = new RedHulk();

		MarvelGame leader = new MarvelGame(bravo);
		
		leader.fightWithOther();
		
		Falcon sam = new Falcon();
		
//		MarvelGame flyer = new MarvelGame(sam);
//		flyer.

	}

}
