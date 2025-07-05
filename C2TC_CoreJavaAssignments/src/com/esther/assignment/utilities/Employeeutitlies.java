package com.esther.assignment.utilities;
import com.esther.assignment.employees.*;

public class Employeeutitlies {
	

	public class EmployeeUtilities {

		public static double bonuscalc(Employee em) {
			double bonus =0;
			if(em.getSalary()>50000) {
				bonus=em.getSalary()*0.10;
			}
			return bonus;
		}
	}

}
