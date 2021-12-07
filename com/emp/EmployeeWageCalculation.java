package com.emp;
/*import static com.emp.EmployeeWage.TOTAL_WORK_DAY;
import static com.emp.EmployeeWage.FULL_DAY_WORKING_HOUR;
import static com.emp.EmployeeWage.MAX_WORKING_HOUR;
import static com.emp.EmployeeWage.SALARY_PER_HOUR;
*/
public class EmployeeWageCalculation {
		static int totalSalary;
		static int totalWorkingHour;
	
	public static void main(String[] args) {
		
		//code for UC7 problem
		
		/*EmployeeWage emp = new EmployeeWage ("avinash");
		int day = 0;
		while (day < TOTAL_WORK_DAY && totalWorkingHour + FULL_DAY_WORKING_HOUR <= MAX_WORKING_HOUR) {
			day++;
			int workingHour = emp.getWorkingHour(emp.isEmpPresent());
			totalWorkingHour += workingHour;*/
		
		
		//code for UC8 problem
			
			EmpWageForMultiCompany  obj = new EmpWageForMultiCompany("avinash" , "infosys" , 8, 20, 30, 80);
			int day = 0;
			while (day < obj.TOTAL_WORK_DAY &&  totalWorkingHour + obj.FULL_DAY_WORKING_HOUR <= obj.MAX_WORKING_HOUR ) {
				day++;
				
				int workingHour = obj.getWorkingHour(obj.isEmpPresent());
				totalWorkingHour +=  workingHour;
				}
		totalSalary = totalWorkingHour * obj. SALARY_PER_HOUR;
		System.out.println(obj.empName +  " " + obj.compName+ " monthly wage : " + totalSalary);
		System.out.println(obj.empName + "'s total working hour : " + totalWorkingHour);

	}

}
