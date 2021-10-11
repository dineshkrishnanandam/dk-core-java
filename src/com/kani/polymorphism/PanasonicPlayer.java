package com.kani.polymorphism;

public class PanasonicPlayer extends Player {

	private String model;
	private String madeIn;
	private double price;

	public PanasonicPlayer() {
		
	}
	public PanasonicPlayer(String model, String madeIn, double price) {
		this.model = model;
		this.madeIn = madeIn;
		this.price = price;
	}

	// Chinna Thala

	public void play() {
		System.out.println("Playing music using Panasonic");
	}

	// How to ask STS to generate toString()
	// Right Click -> Source -> Generate toString()
	@Override
	public String toString() {
		return "PanasonicPlayer [model=" + model + ", madeIn=" + madeIn + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((madeIn == null) ? 0 : madeIn.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PanasonicPlayer other = (PanasonicPlayer) obj;
		if (madeIn == null) {
			if (other.madeIn != null)
				return false;
		} else if (!madeIn.equals(other.madeIn))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	// public void displayModelNumber() {
//		System.out.println("Model: " + "PANASONIC-10");
//	}

	
//	public int hashCode() {
//		return 9999;
//	}
	
	
	
//	public boolean equals(PanasonicPlayer o) {
//		
//		boolean isHashCodeSame = ( hashCode() == o.hashCode() );
//
//		return isHashCodeSame && model.equals(o.model) && madeIn.equals(o.madeIn) && price == (o.price);
//	}

	
	
}
