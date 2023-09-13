package com.svit.daythree;

public class ParameterizedConstructor {
	  public static void main(String[] args) {
			int number=2;//local variable
			    	ConstructorConstructor obj = new ConstructorConstructor(4); // Parameterized Constructor Called
			        System.out.println("Number value is: "+obj.number);//Instance variable accessed through the object created through the class which has the Instance variable 
			        System.out.println("Number value is: "+number);//local variable accessed
			    }  
}
