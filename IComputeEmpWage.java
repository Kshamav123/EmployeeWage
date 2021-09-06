package com.EmployeeProblem;

public interface IComputeEmpWage {
	public void addCompanyEmpWage(String company, int empRate, int workingDays, int maxHrs);

	public void computeEmpWage();

	public int getTotalEmpWage(String company);
}
