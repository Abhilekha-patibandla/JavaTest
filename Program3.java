package com.Test;


abstract class Bank{
	abstract void getRateOfIntrest();
}

class SBI extends Bank{

	@Override
	void getRateOfIntrest() {
		// TODO Auto-generated method stub
		System.out.println("SBI Bank");
		
	}
	
}

class HDFC extends Bank{

	@Override
	void getRateOfIntrest() {
		// TODO Auto-generated method stub
		System.out.println("HDFC Bank");
	}
	
}


public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI s=new SBI();
		s.getRateOfIntrest();
		
		HDFC h=new HDFC();
		h.getRateOfIntrest();

	}

}
