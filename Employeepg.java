package com.EmployeeProblem;

public class Employeepg {

	public static final int IS_Part_Time = 1;
    public static final int IS_Full_Time =2;
    public static final int WAGE_Per_Hr =20;
    
	public static void main(String[] args) {
        
        int empHrs = 0;
        int empWage = 0;
        
        int empcheck= (int) Math.floor(Math.random() * 10) % 3;
        switch(empcheck)
         {
         	case IS_Part_Time: {  
         				empHrs = 4;
         				System.out.println("Part-time");
         				break;
         			}
         	case IS_Full_Time: {
         				empHrs = 8;
         				System.out.println("Full-time");
         				break;
         			}
         	default: empHrs = 0;
         }
        empWage = WAGE_Per_Hr * empHrs;
        System.out.println("Employee Wage: Rs.  " + empWage);
	}

}




