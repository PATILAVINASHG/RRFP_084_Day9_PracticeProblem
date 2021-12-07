package com.emp;

public class EmployeeWage {
	
	String empName;
	
		public EmployeeWage(String empName) {
				this.empName = empName;
		}
		
		
		  static final int IS_PRESENT = 1; static final int IS_PART_TIME = 2; static
		  final int FULL_DAY_WORKING_HOUR = 8; static final int SALARY_PER_HOUR = 20;
		  static final int TOTAL_WORK_DAY = 20; static final int MAX_WORKING_HOUR =
		  100;
		 
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
