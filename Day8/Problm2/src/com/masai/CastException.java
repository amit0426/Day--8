package com.masai;

public class CastException {
	
	public static void main(String[] args) {
		A a = new  A("White");
		
		B b = new B("Black");
		
		a = b;
		
		b.display("amit");
	}
	

	

}

class A{
	
	String color;

	public A(String a) {
	 this.color = a;
		// TODO Auto-generated constructor stub
	}
	
	void eat(String name) {
		System.out.println("Is eating "+name);
	}
	
	void display(String name){
		
		System.out.println(name+" " +"is of"+color);
	}
	
}





 class B extends A{

	public B(String a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
	void eat(String name) {
		System.out.println(name+"is eating");
	}
	
}



