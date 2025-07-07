package com.esther.assignment.mainAssignment;
import com.esther.assignment.employees.*;
import com.esther.assignment.utilities.*;
public class mainclass {
	

		public static void main(String[]args) {
			Employee emp = new Employee("lavanya",100,55000);
			System.out.println(emp);
			Manager mg=new Manager("Jayashree",101,60000,"programmer",7);
			Developer dp=new Developer("Jash",5778888,100000,"developer",5);
			System.out.println(mg);
			System.out.println(dp);
			Employeeutitlies.bonuscalc(emp);
			System.out.println("This is the bonus for employee under 50000 : "+Employeeutitlies.bonuscalc(emp));
		}

	}
	




