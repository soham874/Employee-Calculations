package com.empwages;

import java.util.Scanner;

import com.random_generator.randomise;

public class EmpWagesCalculation {

	public static int MAXIMUM_WORK_HOURS = 0;
	public static int MAXIMUM_WORK_DAYS = 0;

	public static void calculate() {
		randomise simulate = new randomise();

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

	}

	public static void DataEntry() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Company name : ");
		String companyName = sc.nextLine();
		System.out.println("Enter maximum allowable working hours");
		MAXIMUM_WORK_HOURS = sc.nextInt();
		System.out.println("Enter maximum allowable working days");
		MAXIMUM_WORK_DAYS = sc.nextInt();
		System.out.println("Enter wage per hour");
		randomise.WAGE_PER_HOUR = sc.nextInt();
		System.out.println('\n' + "~~~~~~~~~~~~~~~~~~~~~~For company " + companyName + " ~~~~~~~~~~~~~~~~~~~~~~");
		calculate();
		sc.close();
	}

	public static void main(String[] args) {
		repeat();
	}

	private static void repeat() {
	
			Scanner sc = new Scanner(System.in);
			//DataEntry();
			System.out.println('\n' + "Enter 1 to retry and 0 to exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				DataEntry();
				repeat();
				break;
			case 2:
				System.exit(0);
			}
			sc.close();
		}
		
	}