package com.collectionqueue;
class User {
    int id;
    String name;


    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee extends User {
    double salary;

  
    public Employee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }


    public double calculateAnnualSalary() {
        return salary * 12; 
    }
}

public class hw01 {
    public static void main(String[] args) {
      
        Employee e = new Employee(1, "Rohan", 8000.0);

     
        double annualSalary = e.calculateAnnualSalary();
        System.out.println("Employee ID Number:" + e.id);
        System.out.println("Employer Name:" + e.name);
        System.out.println("Monthly Salary:" + e.salary+"Rs");
        System.out.println("Annual Salary:" + annualSalary+"RS");
    }
}