import java.util.*;
public class EmpWage {
    public static void main(String args[]) {
        
      int salary=0;
      int empRatePerHr=20;
      int empHrs=8;
      int numberOfWorkingDays=20;
      int totalSalary=0;
    
      for (int i=0;i<numberOfWorkingDays;i++){
          int a = (int)(Math.random()*((2-0)+1))+0;
           switch (a) {
        case 0:
            empHrs=8;
            // System.out.println("Full Time");
            break;
        case 1:
            empHrs=4;
            // System.out.println("Part Time");
            break;
        case 2:
            empHrs=0;
            // System.out.println("Null Time");
            break;
  
    }
      salary=empHrs*empRatePerHr;
      totalSalary=totalSalary+salary;
     
      }
       System.out.println("Total salary for 20 days is: "+totalSalary);
     
    }
}
