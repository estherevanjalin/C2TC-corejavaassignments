package com.esther.assignment.employees;

public class Employee {
	private String name;
	private int id;
	private double Salary;
	public  Employee(String name, int id,double Salary) {
		this.name=name;
		this.id=id;
		this.Salary=Salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Salary=" + Salary + "]";
	}
	
	

}

