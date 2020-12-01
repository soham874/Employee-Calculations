package com.empwages;

import com.random_generator.randomise;

public class EmpWagesCalculation {

	public static void main(String[] args) {
		randomise simulate=new randomise();
		double wage=simulate.runsimulation();
		System.out.println("Employee wage for day is Rs. " + wage);
	}
}
