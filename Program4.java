package com.Test;

abstract class Constructor {

	Constructor() {
		System.out.println("Abstract class constructor");
	}
}

class Class1 extends Constructor{
	Class1(){
		System.out.println("This is subclass constructor");
	}
}

public class Program4 {

	public static void main(String[] args) {
		
		Class1 c=new Class1();

	}

}
