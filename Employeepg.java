package com.EmployeeProblem;

public class Employeepg {
	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation Program on Master branch");
	int IS_Full_Time =1;
	int IS_Present =1;
	int WAGE_Per_Hr =20;
	int FULL_Working_Day =8; 

	int empHrs =0;
	int empWage = 0
        
        double empcheck= Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_Present)
                {
                	empHrs = FULL_Working_Day;
	        	empWage = WAGE_Per_Hr * empHrs;}
        else
                {
                	empHrs = 0;
	        	empWage = WAGE_Per_Hr * empHrs;
	        }
	        System.out.println("Employee Wage: Rs.  " + empWage);
	}


}


