import java.util.*;

public class EmpWageCalculater {

	int salary;
	int empRatePerHr;
	int empHrs;
	int numberOfWorkingDays;
	int totalSalary;

	int maxHrsInMonth;
	int maxDaysInMonth;

	int totalEmpHrs;
	int totalWorkingDays;

	public EmpWageCalculater(int salary, int empRatePerHr, int empHrs, int numberOfWorkingDays, int totalSalary,
			int maxHrsInMonth, int maxDaysInMonth, int totalEmpHrs, int totalWorkingDays) {
		super();
		this.salary = salary;
		this.empRatePerHr = empRatePerHr;
		this.empHrs = empHrs;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.totalSalary = totalSalary;
		this.maxHrsInMonth = maxHrsInMonth;
		this.maxDaysInMonth = maxDaysInMonth;
		this.totalEmpHrs = totalEmpHrs;
		this.totalWorkingDays = totalWorkingDays;
	}

	public void calculateWage(EmpWageCalculater empWageCalculater) {

		while (empWageCalculater.totalEmpHrs < empWageCalculater.maxHrsInMonth
				&& empWageCalculater.totalWorkingDays < empWageCalculater.maxDaysInMonth) {
			int a = (int) (Math.random() * ((2 - 0) + 1)) + 0;
			empWageCalculater.totalWorkingDays++;

			switch (a) {
			case 0:
				empWageCalculater.empHrs = 8;
				// System.out.println("Full Time");
				break;
			case 1:
				empWageCalculater.empHrs = 4;
				// System.out.println("Part Time");
				break;
			case 2:
				empWageCalculater.empHrs = 0;
				// System.out.println("Null Time");
				break;

			}
			empWageCalculater.totalEmpHrs = empWageCalculater.totalEmpHrs + empWageCalculater.empHrs;
			empWageCalculater.salary = empWageCalculater.empHrs * empWageCalculater.empRatePerHr;
			empWageCalculater.totalSalary = empWageCalculater.totalSalary + empWageCalculater.salary;

		}
		System.out.println("Total salary for " + empWageCalculater.totalWorkingDays + " days or "
				+ empWageCalculater.totalEmpHrs + " hours is: " + empWageCalculater.totalSalary);

	}

	public static void main(String args[]) {

		EmpWageCalculater empWageCalculater = new EmpWageCalculater(0, 20, 8, 20, 0, 100, 20, 0, 0);
		empWageCalculater.calculateWage(empWageCalculater);

	}
}
