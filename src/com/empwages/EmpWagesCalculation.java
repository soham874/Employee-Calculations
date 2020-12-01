package com.empwages;

public class EmpWagesCalculation {

	public static void main(String[] args) {
		int WAGE_PER_HOUR = 20;
		int IS_FULL_DAY = 8;
		double wage = 0;

		double check = Math.floor(Math.random() * 10 % 2);
		if (check == 0) {
			wage = WAGE_PER_HOUR * IS_FULL_DAY;

		} else {
			wage = 0;
		}
		System.out.println("Employee wage for day is Rs. " + wage);
	}
}
