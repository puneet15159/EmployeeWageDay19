import java.util.*;

public class EmpWageCalculater implements WageCalculater{

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

	public void calculateWage(List<EmpWageCalculater> empWageCalculaterArray) {

		for (int i = 0; i < empWageCalculaterArray.size(); i++) {
			while (empWageCalculaterArray.get(i).totalEmpHrs <= empWageCalculaterArray.get(i).maxHrsInMonth
					&& empWageCalculaterArray.get(i).totalWorkingDays < empWageCalculaterArray.get(i).maxDaysInMonth) {
				int a = (int) (Math.random() * ((2 - 0) + 1)) + 0;
				empWageCalculaterArray.get(i).totalWorkingDays++;
				if (empWageCalculaterArray.get(i).totalWorkingDays >= 20) {
					break;
				}
				
				if (empWageCalculaterArray.get(i).totalEmpHrs >= 100) {
					break;
				}
				switch (a) {
				case 0:
					empWageCalculaterArray.get(i).empHrs = empWageCalculaterArray.get(i).fullTime;
//					System.out.println("Full Time");
					break;
				case 1:
					empWageCalculaterArray.get(i).empHrs = empWageCalculaterArray.get(i).halfTime;
//					System.out.println("Part Time");
					break;
				case 2:
					empWageCalculaterArray.get(i).empHrs = 0;
//					System.out.println("Null Time");
					break;

				}
				empWageCalculaterArray.get(i).totalEmpHrs = empWageCalculaterArray.get(i).totalEmpHrs
						+ empWageCalculaterArray.get(i).empHrs;
				empWageCalculaterArray.get(i).salary = empWageCalculaterArray.get(i).empHrs
						* empWageCalculaterArray.get(i).empRatePerHr;
				empWageCalculaterArray.get(i).totalSalary = empWageCalculaterArray.get(i).totalSalary
						+ empWageCalculaterArray.get(i).salary;

			}
			System.out.println(empWageCalculaterArray.get(i).store + " Total salary for "
					+ empWageCalculaterArray.get(i).totalWorkingDays + " days or " + empWageCalculaterArray.get(i).totalEmpHrs
					+ " hours is: " + empWageCalculaterArray.get(i).totalSalary);
		}

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of stores");
		int numberOFCompanies = sc.nextInt();
		List<EmpWageCalculater> EmpWageCalculaterArray = new ArrayList<>();
//		EmpWageCalculater EmpWageCalculaterArray[] = new EmpWageCalculater[numberOFCompanies];

		for (int i = 0; i < numberOFCompanies; i++) {
			System.out.println("Store "+i);
			System.out.println();
			System.out.println("Enter full time hours for Store " + (i + 1));
			int fullTimeHrs = sc.nextInt();
			System.out.println("Enter part time hours for Store " + (i + 1));
			int partTimeHrs = sc.nextInt();
			EmpWageCalculater wageCalculater = new EmpWageCalculater("Store "+(i+1), 0, 20, 0, 0, 0, 100, 20, 0, 0, fullTimeHrs, partTimeHrs);
			EmpWageCalculaterArray.add(wageCalculater);
			
		}

		EmpWageCalculater calculater = new EmpWageCalculater();
		calculater.calculateWage(EmpWageCalculaterArray);
	}
}
