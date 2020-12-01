package com.random_generator;

public class randomise {
	public double runsimulation( ) {
		int WAGE_PER_HOUR = 20;
		int IS_FULL_DAY = 8;
		int IS_HALF_DAY = 4;
		double wage = 0;

		double check = Math.floor(Math.random() * 10 % 3);
		switch ((int) check) {
		case 0:
			wage = 0;
			break;
		case 1:
			wage = WAGE_PER_HOUR * IS_HALF_DAY;
			break;
		case 2:
			wage = WAGE_PER_HOUR * IS_FULL_DAY;
			break;
		}
		return wage;
	}
}
