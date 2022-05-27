package com.masai;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird b1 = new Parrot();
		b1.fly();
		
		Parrot b2 = (Parrot)b1;
		b2.sing();

	}

}

class Bird{
	public void fly() {
		System.out.println("Bird is Flying");
		
	}

	

}

class Parrot extends Bird{
	
 @Override
	
	public void fly() {
	
	 System.out.println("I am Flying");
	 
	}
 
  public void sing() {
	  System.out.println("I am Singing");
  }
  
 
	
	
}