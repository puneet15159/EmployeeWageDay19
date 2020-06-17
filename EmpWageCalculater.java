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


	public EmpWageCalculater() {
		super();
	}

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

	public void calculateWage(EmpWageCalculater[] empWageCalculaterArray) {

		for (int i = 0; i < empWageCalculaterArray.length; i++) {
			while (empWageCalculaterArray[i].totalEmpHrs <= empWageCalculaterArray[i].maxHrsInMonth
					&& empWageCalculaterArray[i].totalWorkingDays < empWageCalculaterArray[i].maxDaysInMonth) {
				int a = (int) (Math.random() * ((2 - 0) + 1)) + 0;
				empWageCalculaterArray[i].totalWorkingDays++;
				if (empWageCalculaterArray[i].totalWorkingDays >= 20) {
					break;
				}
				
				if (empWageCalculaterArray[i].totalEmpHrs >= 100) {
					break;
				}
				switch (a) {
				case 0:
					empWageCalculaterArray[i].empHrs = empWageCalculaterArray[i].fullTime;
//					System.out.println("Full Time");
					break;
				case 1:
					empWageCalculaterArray[i].empHrs = empWageCalculaterArray[i].halfTime;
//					System.out.println("Part Time");
					break;
				case 2:
					empWageCalculaterArray[i].empHrs = 0;
//					System.out.println("Null Time");
					break;

				}
				empWageCalculaterArray[i].totalEmpHrs = empWageCalculaterArray[i].totalEmpHrs
						+ empWageCalculaterArray[i].empHrs;
				empWageCalculaterArray[i].salary = empWageCalculaterArray[i].empHrs
						* empWageCalculaterArray[i].empRatePerHr;
				empWageCalculaterArray[i].totalSalary = empWageCalculaterArray[i].totalSalary
						+ empWageCalculaterArray[i].salary;

			}
			System.out.println(empWageCalculaterArray[i].store + " Total salary for "
					+ empWageCalculaterArray[i].totalWorkingDays + " days or " + empWageCalculaterArray[i].totalEmpHrs
					+ " hours is: " + empWageCalculaterArray[i].totalSalary);
		}


	}

	public static void main(String args[]) {


		EmpWageCalculater empWageCalculaterStore1 = new EmpWageCalculater("Store A", 0, 20, 8, 20, 0, 100, 20, 0, 0, 8,
				4);
		empWageCalculaterStore1.calculateWage(empWageCalculaterStore1);

		EmpWageCalculater empWageCalculaterStore2 = new EmpWageCalculater("Store B", 0, 22, 8, 22, 0, 90, 22, 0, 0, 10,
				5);
		empWageCalculaterStore2.calculateWage(empWageCalculaterStore2);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of stores");
		int numberOFCompanies = sc.nextInt();
		EmpWageCalculater EmpWageCalculaterArray[] = new EmpWageCalculater[numberOFCompanies];

		for (int i = 0; i < numberOFCompanies; i++) {
			System.out.println();
			
			System.out.println("Enter full time hours for Store " + (i + 1));
			int fullTimeHrs = sc.nextInt();
			System.out.println("Enter part time hours for Store " + (i + 1));
			int partTimeHrs = sc.nextInt();
			EmpWageCalculater wageCalculater = new EmpWageCalculater("Store "+(i+1), 0, 20, 0, 0, 0, 100, 20, 0, 0, fullTimeHrs, partTimeHrs);
			EmpWageCalculaterArray[i] = wageCalculater;
		
		}

		EmpWageCalculater calculater = new EmpWageCalculater();
		calculater.calculateWage(EmpWageCalculaterArray);

	}
}
