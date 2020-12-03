package com.empwages;

import com.random_generator.Randomise;

public class EmpWagesCalculation {

	public static int MAXIMUM_WORK_HOURS = 0;
	public static int MAXIMUM_WORK_DAYS = 0;
	public static double[] companyWages = new double[100];
	public static int position = 0;
	public static String companyName = "";
	
	public static void calculate(String companyNameInput,int maximumWorkHours,int maximumWorkDays, int wagePerHour) {
		
		MAXIMUM_WORK_HOURS = maximumWorkHours;
		MAXIMUM_WORK_DAYS = maximumWorkDays;
		companyName = companyNameInput;
		Randomise.WAGE_PER_HOUR = wagePerHour;
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~For company " + companyName + " ~~~~~~~~~~~~~~~~~~~~~~");
		Randomise simulate = new Randomise();

		int workdays = 1;
		int workhours = 0;
		double totalWage = 0;

		while (workdays <= MAXIMUM_WORK_DAYS && workhours <= MAXIMUM_WORK_HOURS) {

			double currentworkhour = simulate.getworkhours();
			double currentwage = simulate.getWage(currentworkhour);

			System.out.println("Employee worked for " + currentworkhour + " hours. The wage for day " + workdays
					+ " is Rs." + currentwage);
			totalWage += currentwage;
			workhours += currentworkhour;
			workdays++;
		}

		System.out.println("Total hours worked is " + workhours);
		System.out.println("Total earnings of the employee is Rs." + totalWage);
		companyWages[position] = totalWage;
		position++;
	}
}