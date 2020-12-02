package com.empwages;

import java.util.Scanner;

import com.random_generator.Randomise;

public class EmpWagesCalculation {

	public static int MAXIMUM_WORK_HOURS = 0;
	public static int MAXIMUM_WORK_DAYS = 0;
	public static double[] companyWages = new double[100];
	public static int position = 0;
	
	public static void calculate() {
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

	public static void DataEntry() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Company name : ");
		String companyName = sc.nextLine();
		System.out.println("Enter maximum allowable working hours");
		MAXIMUM_WORK_HOURS = sc.nextInt();
		System.out.println("Enter maximum allowable working days");
		MAXIMUM_WORK_DAYS = sc.nextInt();
		System.out.println("Enter wage per hour");
		Randomise.WAGE_PER_HOUR = sc.nextInt();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~For company " + companyName + " ~~~~~~~~~~~~~~~~~~~~~~");
		calculate();

	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		DataEntry();
		while (2 > 1) {
			System.out.println('\n'+"enter 1 to retry and 0 to quit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				DataEntry();
				break;
			default:
				System.out.println('\n'+"Thank You");
				System.exit(0);
			}
		}
	}
}