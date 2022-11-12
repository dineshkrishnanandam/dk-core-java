package com.dex.dates;

import java.time.LocalDate;

public class ExampleFour {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();    
	    LocalDate commingday = today.plusDays(15);    
	    System.out.println("Today date: "+today);    
	    System.out.println("commingday date: "+commingday);    
	}

}
