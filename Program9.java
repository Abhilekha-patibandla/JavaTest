package com.Test;


class Final {
    //final int a;
    int a;
    Final(int b) {
        a = b; 
        System.out.println("Final variable a = " + a);
    }
}

public class Program9 {

	public static void main(String[] args) {
		
		Final a1=new Final(10);
        a1.a=70;
	}

}
