package com.Test;


final class Security{
	void display() {
		System.out.println("method in final classs");
	}
}
//class subclass extends Security{
//	
//}
//final class cannot be inherited

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Security s=new Security();
		s.display();

	}

}
