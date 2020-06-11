import java.util.*;
public class EmpWage {
    public static void main(String args[]) {
        
      int salary=0;
      int empRatePerHr=20;
      int empHrs=8;
      double a = Math.random();
      if (a<0.5){
          System.out.println("Emplyee is present");
          salary=empHrs*empRatePerHr;
          System.out.println("salary is: "+salary);
      }
      else{
          System.out.println("Emplyee is absent");
          salary=0;
          System.out.println("salary is: "+salary);
      }
      
    }
}
