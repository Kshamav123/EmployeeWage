package com.EmployeeProblem;

public class Employeepg {

	public static final int IS_Part_Time = 1;
    public static final int IS_Full_Time =2;
    public static final int WAGE_Per_Hr =20;
    public static final int Working_Days = 20;
    
    public static void main(String[] args) {
        
        int empHrs = 0;
        int empWage = 0, total = 0;
        
        for(int i=0; i<20; i++)
        {
            int empcheck= (int) Math.floor(Math.random() * 10) % 3;
            switch(empcheck)
            {
                case IS_Part_Time: {  
                                        empHrs = 4;                                     
                                        break;
                                    }
                case IS_Full_Time: {
                                        empHrs = 8;
                                        break;
                                    }
                default: empHrs = 0;
            }//switch case ends here
            empWage = WAGE_Per_Hr * empHrs;
            total += empWage;
        }
        System.out.println("Employee Wage for a month: Rs.  " + total);
    }

    }






