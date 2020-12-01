package com.empwages;

public class EmpWagesCalculation {

	public static void main(String[] args) {
		double check = Math.floor(Math.random() * 10 % 2);
		if (check == 0)
			System.out.println("Employee is absent.");
		else
			System.out.println("Employee is present.");
	}
}
