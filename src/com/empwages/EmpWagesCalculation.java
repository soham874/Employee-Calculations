package com.empwages;

public class EmpWagesCalculation {

	public static void main(String[] args) {
		int WAGE_PER_HOUR = 20;
		int IS_FULL_DAY = 8;
		int IS_HALF_DAY = 4;
		double wage = 0;

		double check = Math.floor(Math.random() * 10 % 3);
		if (check == 2) 
			wage = WAGE_PER_HOUR * IS_FULL_DAY;
		else if (check == 1) 
			wage = WAGE_PER_HOUR * IS_HALF_DAY;
		else
			wage = 0;;
			
		System.out.println("Employee wage for day is Rs. " + wage);
	}
}
