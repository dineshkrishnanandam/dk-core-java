package com.dex.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleThree {
	public static void main(String args[])      
	{  
	try  
	{  
	SimpleDateFormat msd = new SimpleDateFormat("dd/MM/yyyy", java.util.Locale.ENGLISH);  
	Date date= msd.parse("04/04/1999");  
	//specifies the pattern to print  
	msd.applyPattern("EEE, d MMM yyyy");  
	String str = msd.format(date);  
	//prints day name with date  
	System.out.println(str);  
	}  
	catch (Exception e)  
	{  
	e.printStackTrace();  
	}  
	}  

}
