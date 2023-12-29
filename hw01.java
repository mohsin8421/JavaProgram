package com.collectionqueue;
class User{
	int id;
	String name; //Creating Properties
	
	public User(int id,String name) {
		this.id=id;
		this.name=name;  //Creating of the constructor
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}

class Employee extends User{  //Creating 2nd Properties
	double salary;
	
	public Employee(int id,String name,double salary) {
		super(id,name);
		this.salary=salary;   //Creating 2nd Constructor
	}
	
	
	 // Method calculate to Annual salary
	public double calculateAnnualSalary() {
		return salary*12;
	}
}
public class hw01 {

	public static void main(String [] args) {
		Employee emp = new Employee(1,"MK",50000);
		
		double annualsalary = emp.calculateAnnualSalary();
		System.out.println("ID : " + emp.getId() +",  FIRST_NAME : "+emp.getName() + ", ANNUAL SALARY :"+annualsalary+"RS");
	}
}