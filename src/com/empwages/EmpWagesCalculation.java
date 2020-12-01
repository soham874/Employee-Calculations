package com.empwages;

import com.random_generator.Randomise;

public class EmpWagesCalculation {

	public static void calculate(){
		Randomise simulate=new Randomise();
		
		int MAXIMUM_WORK_HOURS = 100;
		int MAXIMUM_WORK_DAYS = 20;
		
		int workdays = 1;
		int workhours = 0;
		double totalWage = 0;
		
		while ( workdays <= MAXIMUM_WORK_DAYS && workhours <= MAXIMUM_WORK_HOURS ) {
			
			double currentworkhour = simulate.getworkhours();
			double currentwage = simulate.getWage(currentworkhour);
						
			System.out.println("Employee worked for " + currentworkhour + " hours. The wage for day " + workdays + " is Rs."+ currentwage);
			totalWage+=currentwage;
			workhours+=currentworkhour;
			workdays++;
		}
		
		System.out.println("Total hours worked is " + workhours);
		System.out.println("Total earnings of the employee is Rs." + totalWage);

	}
	
	public static void main(String[] args) {
		calculate();	
		
	}
}
