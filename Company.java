package com.EmployeeProblem;

public class Company {
	 public final String company;  
	 public final int empRate;     
	 public final int workingDays; 
	 public final int maxHrs;      
	 public int totalWage;
	 public int empWage;
	
	public Company(String company,int empRate,int workingDays,int maxHrs)
	{
		this.company=company;
		this.empRate = empRate;
		this.workingDays = workingDays;
		this.maxHrs = maxHrs;
	}
	
	public void setTotalEmpWage(int totalWage)
	{
		this.totalWage=totalWage;
	}
	
	

	public int setEmpWage(int empWage) {
		return this.empWage = empWage;
	}

	@Override
	public String toString() {
		return "Total Employee Wage of the company "+company+ " is: Rs. "+totalWage;
				} 

}


