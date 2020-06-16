import java.util.*;

public class EmpWageCalculater {

	String store;
	int salary;
	int empRatePerHr;
	int empHrs;
	int numberOfWorkingDays;
	int totalSalary;

	int maxHrsInMonth;
	int maxDaysInMonth;

	int totalEmpHrs;
	int totalWorkingDays;

	int fullTime;
	int halfTime;

	public EmpWageCalculater(String store, int salary, int empRatePerHr, int empHrs, int numberOfWorkingDays,
			int totalSalary, int maxHrsInMonth, int maxDaysInMonth, int totalEmpHrs, int totalWorkingDays, int fullTime,
			int halfTime) {
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
		this.store = store;
		this.fullTime = fullTime;
		this.halfTime = halfTime;
	}

	public void calculateWage(EmpWageCalculater empWageCalculater) {

		while (empWageCalculater.totalEmpHrs < empWageCalculater.maxHrsInMonth
				&& empWageCalculater.totalWorkingDays < empWageCalculater.maxDaysInMonth) {
			int a = (int) (Math.random() * ((2 - 0) + 1)) + 0;
			empWageCalculater.totalWorkingDays++;

			switch (a) {
			case 0:
				empWageCalculater.empHrs = empWageCalculater.fullTime;
				// System.out.println("Full Time");
				break;
			case 1:
				empWageCalculater.empHrs = empWageCalculater.halfTime;
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
		System.out.println(empWageCalculater.store + " Total salary for " + empWageCalculater.totalWorkingDays
				+ " days or " + empWageCalculater.totalEmpHrs + " hours is: " + empWageCalculater.totalSalary);

	}

	public static void main(String args[]) {

		EmpWageCalculater empWageCalculaterStore1 = new EmpWageCalculater("Store 1", 0, 20, 8, 20, 0, 100, 20, 0, 0, 8,
				4);
		empWageCalculaterStore1.calculateWage(empWageCalculaterStore1);

		EmpWageCalculater empWageCalculaterStore2 = new EmpWageCalculater("Store 2", 0, 22, 8, 22, 0, 90, 22, 0, 0, 10,
				5);
		empWageCalculaterStore2.calculateWage(empWageCalculaterStore2);

	}
}
