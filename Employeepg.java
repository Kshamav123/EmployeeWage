package com.EmployeeProblem;

public class Employeepg implements IComputeEmpWage{
	public static final int IS_Part_Time = 1;
    public static final int IS_FULL_TIME =2;
	
	private  int numOfCompany=0;
	private Company[] CompanyArray;
	
	//constructor for initializing members of a class
	public Employeepg()
	{
		CompanyArray = new Company[5];
		
	}
	
	//Method to create an object and add details of multiple companies
	public void addCompanyEmpWage(String company,int empRate,int workingDays,int maxHrs)
	{
		CompanyArray[numOfCompany]=new Company(company, empRate, workingDays, maxHrs);
		numOfCompany++;
	}
	
	//Static method to compute the wage for a particular company
	public void computeEmpWage()
	{
		for(int i=0;i<numOfCompany;i++)
		{
			CompanyArray[i].setTotalEmpWage(this.computingEmpWage(CompanyArray[i]));
			System.out.println(CompanyArray[i]);
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
		Employeepg employeeWageBuilder =new Employeepg();
		
		employeeWageBuilder.addCompanyEmpWage("Infosys",20,80,100);
		employeeWageBuilder.addCompanyEmpWage("Reliance",10,20,150);
		employeeWageBuilder.addCompanyEmpWage("Accenture",80,20,100);
		employeeWageBuilder.computeEmpWage();             

	}

}




