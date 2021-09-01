package com.EmployeeProblem;

public class UC7 {
    public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;
    public final int workingDays=20;
    public final int empRate=20;
    public final int maxHrs=100;

    public UC7()

    {
        
    }

    public static void main(String[] args) {
        UC7 obj = new UC7();
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0, totalWorkHrs = 0, totalWorkingDays = 0;
        while (totalWorkHrs <= obj.maxHrs && totalWorkingDays < obj.workingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
            case Is_Part_Time: {
                empHrs = 8;
                break;
            }
            case Is_Full_Time: {
                empHrs = 4;
                break;
            }
            default:
                empHrs = 0;
            }
            totalWorkHrs +=empHrs;
            empWage = obj.empRate * empHrs; 
            totalEmpWage += empWage;
            System.out.println("Day " + totalWorkingDays + " ");
            System.out.println("Employee Wage for Company : Rs."  + empWage);
        }

    }
}