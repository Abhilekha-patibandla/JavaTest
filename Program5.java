package com.Test;

class Addition{
	
	void add(int a,int b) {
		System.out.println(a+b);
	}
	
	void add(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	
	void add(double a,double b) {
		System.out.println(a+b);
	}
	
}

public class Program5 {

	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(10,20);
		a.add(10,20,30);
		a.add(10.0,20.0);

	}

}
