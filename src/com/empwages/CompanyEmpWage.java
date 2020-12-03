package com.empwages;

public class CompanyEmpWage implements WageBuilderInterface {
/*	
	public static int maxWH;
	public static int maxWD;
	public static String cN;
	public static int wPH;
	
		public CompanyEmpWage(String companyName,int maximumWorkHours,int maximumWorkDays, int wagePerHour) {
			maxWD = maximumWorkDays;
			maxWH = maximumWorkHours;
			cN = companyName;
			wPH = wagePerHour;
		}
*/	
		
		public void CompanyCalculate() {
			
			String[] comName = {"TCS","Dell","HP","Lenovo","Wipro"};
			int[] mWH = {100,150,200,175,180};
			int[] mWD = {20,15,25,18,23};
			int[] pPH = {20,50,30,45,50};
			
			for (int i = 0; i<=4; i++) {
				EmpWagesCalculation.calculate(comName[i],mWH[i],mWD[i],pPH[i]);
			}
			
		}
		
		public static void main(String[] args) {
			
			CompanyEmpWage obj = new CompanyEmpWage();
			obj.CompanyCalculate();
			
		}
}