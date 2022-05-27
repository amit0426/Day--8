package com.masai;

public class Main {
	
	public static void main(String[] args) {
		
		Animal[] a = new Animal[4];
//		Animal details********************************
		
		a[0]=new Animal();
//         a[0].makeNoise();
//         a[0].eat();
//         a[0].walk();
         
//         dog details**********************
         
         a[1] = new Dog();
//         a[1].makeNoise();
         
         a[2] = new Cat();
//         a[2].eat();
//         a[2].makeNoise();
          
         a[3] = new Tiger();
//         a[3].makeNoise();
         
         
         for(int i=1; i<a.length; i++) {
        	 
        	 a[i].eat();
        	 a[i].walk();
        	 a[i].makeNoise();
        	 
        	 System.out.println("*******************************");
        	 
        	
         }
         
         
	}

	


}



 class Animal {
   
	 
	 public Animal() {
		// TODO Auto-generated constructor stub
		
	} 
	
	    public void makeNoise(){
		System.out.println("Animal making Noise");
		}
		public void eat(){
		System.out.println("Animal is eating");
		}
		public void walk(){
		System.out.println("Animal is walking");
		}



}
 
// ********************************
 
 class Dog extends Animal{
	@ Override
	 public void makeNoise(){
			System.out.println("Barking...");
			}
	 
 }
 
 class Cat extends Animal{
	 @Override
	 
	 public void makeNoise(){
			System.out.println("Meaw...");
			}
	 
	 
 }
 
 class Tiger extends Animal{
	 @Override
	 public void makeNoise(){
			System.out.println("Animal making Noise");
			}
 }
 
// ****************************
 
 
 
 
 
 
 
 
 
 
 
 

