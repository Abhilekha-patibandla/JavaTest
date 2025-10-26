package com.Test;


class Vehicle{
	
	public void start() {
		
		System.out.println("Vehicle starts");
	}
}

class Car extends Vehicle{
	
	public void start() {
		super.start();
		System.out.println("Car starts");
	}
}


public class Program8 {

	public static void main(String[] args) {
		Car c=new Car();
		c.start();

	}

}
