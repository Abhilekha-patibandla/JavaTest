package com.Test;

interface Shape{
	void area();
}
class Rectangle implements Shape{

	@Override
	public void area() {
		double length=10;
		double width=5;
		double area=length*width;
		System.out.println("Area of rectangle: "+area);
		
	}
	
}
class Circle implements Shape{

	@Override
	public void area() {
		double pi=3.14;
		int r=5;
		double circleArea=pi*r*r;
		System.out.println("Area of circle: "+circleArea);
	}
	
}

public class Problem1 {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.area();
		Rectangle r=new Rectangle();
		r.area();

	}

}
