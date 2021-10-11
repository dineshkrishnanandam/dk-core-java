package com.dex.encapsulationdemos;

public class EncapsulationDemo1Test {

  public static void main(String args[]){
       EncapsulationDemo1 obj = new EncapsulationDemo1();
       obj.setEmpName("Mario");
       obj.setEmpAge(32);
       obj.setEmpSSN(112233);
       System.out.println("Employee Name: " + obj.getEmpName());
       System.out.println("Employee SSN: " + obj.getEmpSSN());
       System.out.println("Employee Age: " + obj.getEmpAge());
  } 
	
	

}
