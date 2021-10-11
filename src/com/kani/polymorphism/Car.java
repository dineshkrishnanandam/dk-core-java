package com.kani.polymorphism;

public class Car {
	
	
	Player p;
	
	Car(Player d) {
		this.p = d;
	}
	
	
public void stand() {
		
		
		System.out.println("hashCode " + hashCode());
	}

//public void standup() {
//	
//	
//	System.out.println("toString " + toString());
//}

//public String  toString() {
//	
//	return "dinesh";
//}




	void playSong() {
		//Polymorphisim, because  p.play() doesn't know which brand it is going to use.
		// Brand of the player will be decided at runtime (when running the program)
		p.play();
		//p.displayModelNumber();
	}

}
