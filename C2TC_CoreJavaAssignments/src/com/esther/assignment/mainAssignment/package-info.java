package com.esther.assignment.mainAssignment;
import com.esther.assignment.employees.*;
import com.esther.assignment.utilities.*;


public class mainAssignment {
public static void main(String[]args) {
	Employee emp = new Employee("lavanya",100,55000);
	System.out.println(emp);
	emp = new Manager("esther",101,51000,"Programmer",5);
	System.out.println(emp);
	emp = new Developer("sheroll",102,60000,"python",4);
	System.out.println(emp);
	Employeeutitlies.bonuscalc(emp);
	System.out.println("This is the bonus for employee under 50000 : "+Employeeutitlies.bonuscalc(emp));
}
}