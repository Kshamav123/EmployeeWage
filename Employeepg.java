package com.EmployeeProblem;
public class Employeepg{

  //class members
        public static final int Is_Part_Time = 1;
        public static final int Is_Full_Time = 2;

        private final String company;
        private final int empRate;
        private final int workingDays;
        private final int maxHrs;
        private int totalEmpWage;
        
          //constructor of class Employeepg
        public Employeepg(int empRate, int workingDays, int maxHrs, String company) {
            this.empRate = empRate;
            this.company = company;
            this.workingDays = workingDays;
            this.maxHrs = maxHrs;
        }
         // function
        public void computeWage() {
            //variables
            int empHrs = 0;
            int empWage = 0, totalWorkHrs = 0, totalWorkingDays = 0;
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
                empWage = empRate * empHrs;
                totalWorkHrs += empHrs;
                totalEmpWage += empWage;
                
            }
            System.out.println("Employee Wage for a month in " + company + ": Rs. " + totalEmpWage);
            
        }
        

        
        @Override
        public String toString() {
            return "Employee wage [totalEmpWage=" + totalEmpWage + "]";
        }
        
        public static void main(String[] args) {
            
       Employeepg infosys = new Employeepg(20,40,45,"Infosys");
       infosys.computeWage();
       System.out.println(infosys);
       Employeepg reliance = new Employeepg(70,40,45,"Reliance");
       reliance.computeWage();
       System.out.println(reliance);

            
        }

    }
}



