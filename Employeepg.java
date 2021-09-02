package com.EmployeeProblem;

public class UC8 {
     //class members
    public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;

    private final String company;
    private final int empRate;
    private final int workingDays;
    private final int maxHrs;
      //constructor of class UC8
    public UC8(int empRate, int workingDays, int maxHrs, String company) {
        this.empRate = empRate;
        this.company = company;
        this.workingDays = workingDays;
        this.maxHrs = maxHrs;
    }
     // function
    public void computeWage(int empRate, int workingDays, int maxHrs, String company) {
        //variables
        int empHrs = 0;
        int empWage = 0, totalEmpWage = 0, totalWorkHrs = 0, totalWorkingDays = 0;
        while (totalWorkHrs <= maxHrs && totalWorkingDays < workingDays) {
            
            totalWorkingDays++;
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck) {
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
            totalWorkHrs += empHrs;
            empWage = empRate * empHrs;
            totalEmpWage += empWage;
        }
        System.out.println("Employee Wage for a month in " + company + ": Rs. " + totalEmpWage);

    }

    public static void main(String[] args) {
        
         //creating the object
        UC8 company1 = new UC8(20, 20, 100, "RELIANCE");
        UC8 company2 = new UC8(30, 10, 40, "Infosys");
        UC8 company3 = new UC8(40, 30, 70, "Accenture");

        company1.computeWage(20, 20, 100, "RELIANCE");
        company2.computeWage(30, 10, 40, "Infosys");
        company3.computeWage(40, 30, 70, "Accenture");
    }

}
