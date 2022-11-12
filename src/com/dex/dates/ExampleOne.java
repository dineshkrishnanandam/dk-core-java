package com.dex.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExampleOne {

	public static void main(String[] args) {

		
		DateTimeFormatter dex = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dex.format(now));  
	}

}
