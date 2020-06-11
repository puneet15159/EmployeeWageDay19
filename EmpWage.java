import java.util.*;
public class EmpWage {
    public static void main(String args[]) {
        
      int salary=0;
      int empRatePerHr=20;
      int empHrs=8;
      double a = Math.random();
      if (0.0 < a && a < 0.33){
          empHrs=8;
          System.out.println("Full Time");
      } 
      else if (0.33 <= a && a < 0.66){
          empHrs=4;
          System.out.println("Part Time");
      }
      else{
          empHrs=0;
          System.out.println("Null Time");
      }

      salary=empHrs*empRatePerHr;
      System.out.println("salary is: "+salary);
    }
}
