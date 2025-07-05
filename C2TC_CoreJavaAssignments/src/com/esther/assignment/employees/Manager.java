package com.esther.assignment.employees;

public class Manager extends Employee {
	private String department;
	private int teamsize;
	public Manager(String name,int id,double Salary,String department,int teamsize) {
		super(name,id,Salary);
		this.department= department;
		this.teamsize=teamsize;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	@Override
	public String toString() {
		return "Manager [ "+super.toString()+"department=" + department + ", teamsize=" + teamsize + "]";
	}
	
	

}
