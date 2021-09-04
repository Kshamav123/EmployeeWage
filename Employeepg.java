package com.EmployeeProblem;

import java.util.ArrayList;

public class Employeepg implements IComputeEmpWage{
	public static final int IS_Part_Time = 1;
    public static final int IS_FULL_TIME =2;
	
	private  int numOfCompany=0;
	private ArrayList<Company> CompanyArrayList;
	
	//constructor for initializing members of a class
	public Employeepg()
	{
		CompanyArrayList = new ArrayList<>();
		
	}
	
	//Method to create an object and add details of multiple companies
	public void addCompanyEmpWage(String company,int empRate,int workingDays,int maxHrs)
	{
		Company companyEmpWage1 =new Company(company, empRate, workingDays, maxHrs);
		CompanyArrayList.add(companyEmpWage1);
		numOfCompany++;
	}
	
	//Static method to compute the wage for a particular company
	public void computeEmpWage()
	{
		for(int i=0;i<CompanyArrayList.size();i++)
		{
			Company CompanyEmpWage = CompanyArrayList.get(i);
			CompanyEmpWage.setTotalEmpWage(this.computingEmpWage(CompanyEmpWage));
			System.out.println(CompanyEmpWage);
		}
	}
	
	private int computingEmpWage(Company Company)         
	{                                                                                             
		//variables                                                                               
	    int empHrs = 0;                                                                           
	    int empWage = 0, totalEmpWage = 0, totalWorkHrs = 0, totalWorkingDays =0;                 
	    //Computation                                                                             
	    while (totalWorkHrs <= Company.maxHrs && totalWorkingDays < Company.workingDays)                          
	    {                                                                                         
	    	totalWorkingDays++;                                                                   
	    	int empcheck= (int) Math.floor(Math.random() * 10) % 3;                               
	    	switch(empcheck)                                                                      
	    	{                                                                                     
	     		case IS_Part_Time: {                                                              
	     								empHrs = 8;                                                                      
	     								break;                                                    
	     							}                                                             
	     		case IS_FULL_TIME: {                                                              
	     								empHrs = 4;                                                                      
	     								break;                                                    
	     							}                                                             
	     		default: empHrs = 0;                                                              
	    	}                                                                     
	    	totalWorkHrs += empHrs;                                                                                                    
	    	totalEmpWage = Company.empRate + totalWorkHrs;                                                               
	    }                                                                    
	    return totalEmpWage;
	}                                                                                             

	public static void main(String[] args) {
		//object creation
		IComputeEmpWage employeeWageBuilder =new Employeepg();
		
		employeeWageBuilder.addCompanyEmpWage("Infosys",20,80,100);
		employeeWageBuilder.addCompanyEmpWage("Reliance",10,20,150);
		employeeWageBuilder.addCompanyEmpWage("Accenture",80,20,100);
		employeeWageBuilder.computeEmpWage();             

	}

}




