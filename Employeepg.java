package com.EmployeeProblem;

public class Employeepg {

	public static final int IS_Part_Time = 1;
    public static final int IS_Full_Time =2;
    public static final int Wage_Per_Hr =20;
    public static final int Working_Days = 20;
    public static final int Work_Hours = 100;
    
    public static void main(String[] args) {
        
        int empHrs = 0;
        int empWage = 0, totalEmpWage = 0, totalWorkHrs = 0, totalWorkingDays =0;
        
        while (totalWorkHrs <= 100 && totalWorkingDays < 20)
        {
            totalWorkingDays++;
            int empcheck= (int) Math.floor(Math.random() * 10) % 3;
            switch(empcheck)
            {
                case IS_Part_Time: {  
                                        empHrs = 8;
                                        //System.out.println("Full-time");
                                        break;
                                    }
                case IS_Full_Time: {
                                        empHrs = 4;
                                        //System.out.println("Part-time");
                                        break;
                                    }
                default: empHrs = 0;
            }
            totalWorkHrs += empHrs;
            empWage = Wage_Per_Hr * empHrs;
            totalEmpWage += empWage;
            System.out.println("Employee Wage: Rs. " + empWage);
        }
        System.out.println("Employee Wage for a month: Rs.  " + totalEmpWage);
    }


}
