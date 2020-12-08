package com.empwages;

import com.random_generator.Randomise;
import java.util.ArrayList;

public class EmpWagesCalculation {

	public static int MAXIMUM_WORK_HOURS = 0;
	public static int MAXIMUM_WORK_DAYS = 0;
	public static ArrayList<Double> companyWages;
	public static ArrayList<ArrayList<Double>> dailyWages;
	public static ArrayList<String> companyName;
	
	public static void calculate(String companyNameInput,int maximumWorkHours,int maximumWorkDays, int wagePerHour) {
		
		dailyWages.add(new ArrayList<Double>());
		MAXIMUM_WORK_HOURS = maximumWorkHours;
		MAXIMUM_WORK_DAYS = maximumWorkDays;
		
		Randomise.WAGE_PER_HOUR = wagePerHour;
		CompanyEmpWage obj = new CompanyEmpWage();
		
		obj.addValues(companyNameInput);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~For company " + companyNameInput + " ~~~~~~~~~~~~~~~~~~~~~~");
		Randomise simulate = new Randomise();

		int workdays = 1;
		int workhours = 0;
		double totalWage = 0;

		while (workdays <= MAXIMUM_WORK_DAYS && workhours <= MAXIMUM_WORK_HOURS) {

			double currentworkhour = simulate.getworkhours();
			double currentwage = simulate.getWage(currentworkhour);

			System.out.println("Employee worked for " + currentworkhour + " hours. The wage for day " + workdays
					+ " is Rs." + currentwage);
			dailyWages.get(companyName.size()-1).add(workdays-1, currentwage);
			totalWage += currentwage;
			workhours += currentworkhour;
			workdays++;
			
		}
		
		obj.addValues(totalWage);
		//System.out.println(dailyWages);
		System.out.println("Total hours worked is " + workhours);
		System.out.println("Total earnings of the employee is Rs." + totalWage);
		
	}
}