package com.empwages;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyEmpWage implements WageBuilderInterface {

	final static String[] comName = { "TCS", "Dell", "HP", "Lenovo", "Wipro" };

	/*
	 * public static int maxWH; public static int maxWD; public static String cN;
	 * public static int wPH;
	 * 
	 * public CompanyEmpWage(String companyName,int maximumWorkHours,int
	 * maximumWorkDays, int wagePerHour) { maxWD = maximumWorkDays; maxWH =
	 * maximumWorkHours; cN = companyName; wPH = wagePerHour; }
	 */

	public void EmpWageBuilder() {
		EmpWagesCalculation.companyName = new ArrayList<String>();
		EmpWagesCalculation.dailyWages = new ArrayList<ArrayList<Double>>();
		EmpWagesCalculation.companyWages = new ArrayList<Double>();
	}
	
	public void addValues(String companyNameInput) {
		EmpWagesCalculation.companyName.add(companyNameInput);
	}
	
	public void addValues(double totalWage) {
		EmpWagesCalculation.companyWages.add(totalWage);
	}
	
	public void CompanyCalculate() {

		int[] mWH = { 100, 150, 200, 175, 180 };
		int[] mWD = { 20, 15, 25, 18, 23 };
		int[] pPH = { 20, 50, 30, 45, 50 };

		for (int i = 0; i <= 4; i++) {
			EmpWagesCalculation.calculate(comName[i], mWH[i], mWD[i], pPH[i]);
		}

	}

	public static void main(String[] args) {

		WageBuilderInterface obj = new CompanyEmpWage();
		obj.EmpWageBuilder();
		obj.CompanyCalculate();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name of company whose total wage you want");
		String name = sc.next();

		int flag = 0;

		for (int i = 0; i <= 4; i++) {
			if (name.equals(comName[i])) {
				flag = 1;
				System.out.println(
						"Total wage for company " + comName[i] + " is Rs." + EmpWagesCalculation.companyWages.get(i));
			}
		}

		if (flag == 0)
			System.out.println("Sorry company not found");

		sc.close();

	}
}