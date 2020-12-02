package com.random_generator;

public class randomise {
	
	public static int IS_FULL_DAY = 8;
	public static int IS_HALF_DAY = 4;
	public static int WAGE_PER_HOUR = 0;
	
	public double getworkhours( ) {
	
		double empHours = 0;
		double check = Math.floor(Math.random() * 10 % 3);
		switch ((int) check) {
		case 0:
			empHours = 0;
			break;
		case 1:
			empHours = IS_HALF_DAY;
			break;
		case 2:
			empHours = IS_FULL_DAY;
			break;
		}
		return empHours;
	}
	
	public double getWage(double empHours) {
				
		double wage = 0;
		
		wage = empHours * WAGE_PER_HOUR;
		return wage;
	}
}
