package com.empwages;

import com.random_generator.randomise;

public class EmpWagesCalculation {

	public static void main(String[] args) {
		randomise simulate=new randomise();
		
		for (int day=1; day <= 20; day ++) {
			double wage=simulate.runsimulation();
			System.out.println("Employee wage for day " + day + " is Rs." + wage);
		}
	}
}
