package com.kani.polymorphism;

public class CarApp {

	public static void main(String[] args) {
		
		//Player p1 = new Player();

		Player myPlayer = new LocalPlayer();

		// Player myPlayer = new SonyPlayer();

		//Player myPlayer = new PanasonicPlayer();
		Car honda = new Car(myPlayer);
		Car sept = new Car(myPlayer);

		honda.playSong();
//		honda.stand();
//		honda.standup();
//		sept.toString();
//		String a ;
//		 a = sept.toString();
		System.out.println(sept);
	}

}
