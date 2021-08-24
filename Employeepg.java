package com.EmployeeProblem;

public class Employeepg {
	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation Program on Master branch");
	int IS_Full_Time =1; 
        
        double empcheck= Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_Full_Time)
                System.out.println("Employee is Present");
        else
                System.out.println("Employee is Absent");
	}


}


