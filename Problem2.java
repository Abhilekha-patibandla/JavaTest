package com.Test;

interface printable{
	void print();
}
interface showable{
	void show();
}

class Document implements printable,showable{

	@Override
	public void show() {
		System.out.println("Showable method");
		
	}

	@Override
	public void print() {
		System.out.println("Printable method");
		
	}
	
}

public class Problem2 {

	public static void main(String[] args) {
		Document d=new Document();
		d.show();
		d.print();

	}

}
