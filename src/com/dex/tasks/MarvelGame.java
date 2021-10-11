package com.dex.tasks;

public class MarvelGame {

	MarvelHeros p;
	
	

	MarvelGame(MarvelHeros d) {
		this.p = d;
	}
	
	void fightWithOther() {
		p.fight();
	}
	/////////////////////////////
	Falcon x;
	
	MarvelGame(Falcon q) {
		this.x = q;
	}
	
	
//  void jumpWithOther() {
//	  x.jump();
//  }
//  
  
}
