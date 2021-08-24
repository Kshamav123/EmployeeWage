package com.EmployeeProblem;

public class Employeepg {

	public static void main(String[] args) {

	int IS_Full_Time =1;
	int IS_Present =1;
	int WAGE_Per_Hr =20;

	int empHrs =0;
	int empWage = 0
        
        double empcheck= Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_Full_Time)
                {
                	empHrs = 8
	        	empWage = WAGE_Per_Hr * empHrs;
        	        System.out.println("Full-time");
        }
        else if (empcheck == IS_Part_Time)
        {
                	empHrs = 8;
	        	empWage = WAGE_Per_Hr * empHrs;
	        	System.out.println("Part-time");
        }
	 else 
	{
	 	empHrs = 0;
        	empWage = WAGE_Per_Hr * empHrs;
	 }     	
	        
	        System.out.println("Employee Wage: Rs.  " + empWage);
	}

}		




