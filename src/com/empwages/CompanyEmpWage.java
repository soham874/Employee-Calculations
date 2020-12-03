package com.empwages;

public class CompanyEmpWage {
	
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

		@SuppressWarnings("static-access")
		public static void main(String[] args) {
			
			String[] comName = {"TCS","Dell","HP","Lenovo","Wipro"};
			int[] mWH = {100,150,200,175,180};
			int[] mWD = {20,15,25,18,23};
			int[] pPH = {20,50,30,45,50};
			
			for (int i = 0; i<=4; i++) {
				CompanyEmpWage obj = new CompanyEmpWage(comName[i],mWH[i],mWD[i],pPH[i]);
				EmpWagesCalculation.calculate(obj.cN, obj.maxWH, obj.maxWD, obj.wPH);
			}
		}
}