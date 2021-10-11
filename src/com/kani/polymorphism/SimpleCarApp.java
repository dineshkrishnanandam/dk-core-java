package com.kani.polymorphism;

public class SimpleCarApp {

	public static void main(String[] args) {

		System.out.println("size=" + args.length);
		if (args.length > 0) {

			for (int i = 0; i < args.length; i++) {

				System.out.println(args[i]);
			}
			

			Player myPlayer = null;

			if (args[0].equals("Sony")) {
				myPlayer = new SonyPlayer();
			} else if (args[0].equals("Panasonic")) {
				myPlayer = new PanasonicPlayer();
			} else {
				myPlayer = new LocalPlayer();
			} 

			// Player myPlayer = new PanasonicPlayer();

			myPlayer.play();
			myPlayer.displayModelNumber();     
		}
		else {
			System.out.println("Program Argument Must Be Given");
		}

	}

}
