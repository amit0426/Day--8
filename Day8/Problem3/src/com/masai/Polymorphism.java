package com.masai;

public class Polymorphism {
	
	// polymorphism is concept of oops 
	// poly - many
	// morphs - differnt forms;
	
	// polyphorism -static polymorphism - method Overloading;
	// polyphorism - dynamic polymorphism - method Overriding;
	/*
	It decides which method is to execute at runtime.
	It can be achieved through dynamic binding.
	It happens between different classes.
	It is required where a subclass object is assigned to a super-class object for dynamic polymorphism.
	Inheritance involved in dynamic polymorphism.
	
	*/
	
	
	
//	polymorphism in java
	public static void main(String[] args) {
		
		Father f = new Child();
		f.Display();
		Child d = new Child();
		d.Display();
	}
	

}

class Father{
	
	public void Display() {
		
		System.out.println("Overridden Method");
	}
}

class Child extends Father{
	
	@Override
	
public void Display() {
		
		System.out.println("Overiden it is called polyphorism");
	}
	
}

