package com.Test;

class Animal{
	
	public void sound() {
		System.out.println("Animal sound");
	}
}

class Dog extends Animal{
	
	public void sound() {
		
		System.out.println("bow-bow");
	}
}

class Cat extends Animal{
	
	public void sound() {
		
		System.out.println("Meow-meow");
	}
}

public class Program7 {

	public static void main(String[] args) {
		
		Animal a=new Animal();
		a.sound();
		
		Animal a1=new Dog();
		a1.sound();
		
		Animal a2=new Cat();
		a2.sound();
		

	}

}
