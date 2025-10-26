package com.Test;

class Employee{
	int salary=10000;
	int calculateSalary() {
		return salary;
	}
}
class Developer extends Employee{
	@Override
 int calculateSalary() {
		return salary+2000;
	}
}
class Manager extends Employee{
int  calculateSalary() {
	return salary+3000;
		
	}
	
}

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developer d1=new Developer();
		System.out.println(d1.calculateSalary());
		Manager m1=new Manager();
		System.out.println(m1.calculateSalary());


	}

}
