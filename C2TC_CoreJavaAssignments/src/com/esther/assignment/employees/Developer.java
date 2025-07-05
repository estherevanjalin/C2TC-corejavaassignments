package com.esther.assignment.employees;

public class Developer  extends Manager{
	private String Language;
	private int experience;
	
	public Developer(String name,int id,double Salary,String department,int teamsize) {
		super(name,id,Salary,department,teamsize);
		this.Language=Language;
		this.experience=experience;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Developer [ "+super.toString()+"Language=" + Language + ", experience=" + experience + "]";
	}
	


}