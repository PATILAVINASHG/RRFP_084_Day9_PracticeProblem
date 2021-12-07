package com.emp;

//Employee Wage for Multiple Company;

public class EmpWageForMultiCompany {
	private final int IS_PRESENT = 1;
	 private final int IS_PART_TIME = 2;
	 
   	 final String empName;
   	 
   	 final String compName;
	 final int FULL_DAY_WORKING_HOUR;
	 final int SALARY_PER_HOUR;
	 final int TOTAL_WORK_DAY ;
	 final int MAX_WORKING_HOUR;

public EmpWageForMultiCompany(String empName , String compName , 
		int FULL_DAY_WORKING_HOUR, int SALARY_PER_HOUR, int TOTAL_WORK_DAY, int MAX_WORKING_HOUR){
	
		this.compName = compName;
		this.empName = empName;
		this.FULL_DAY_WORKING_HOUR = FULL_DAY_WORKING_HOUR ;
		this.SALARY_PER_HOUR = SALARY_PER_HOUR;
		this.TOTAL_WORK_DAY = TOTAL_WORK_DAY;
		this.MAX_WORKING_HOUR = MAX_WORKING_HOUR;

 	}
		public int isEmpPresent() {
			return (int)(Math.floor(Math.random() * 10) % 3);
		}
		
		public int getWorkingHour(int attendanceCheck) {
			int emphr;
			switch (attendanceCheck) {
			case IS_PRESENT:
					emphr = FULL_DAY_WORKING_HOUR;
					break;
					
			case IS_PART_TIME:
					emphr = FULL_DAY_WORKING_HOUR / 2;
					break;
					
			default:
					emphr = 0;
					break;
			}
			return emphr;
		
		}
		
}