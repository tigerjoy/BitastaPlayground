import java.util.*;
public class SalaryCalculation
{
    String name;
    double basicPay;
    double specialAlw; 
    double conveyanceAlw;
    double gross;
    double pf;
    double netSalary;
    double AnnualSal; 
    SalaryCalculation(String n, double bs, double ca)
    {
        name=n;
        basicPay=bs;
        conveyanceAlw=ca;
        specialAlw=0.0;
        gross=0.0;
        pf=0.0;
        netSalary=0.0;
        AnnualSal=0.0;
    }
    void SalaryCal()
    {
        specialAlw=(25.0/100.0)*basicPay;
        gross=basicPay+specialAlw+conveyanceAlw;
        pf=(8.33/100.0)*basicPay;
        netSalary=gross-pf;
        AnnualSal=12*netSalary;
    }
    void display()
    {
       System.out.println("NAME:"+name);
       System.out.println("BASIC PAY:"+basicPay);
       System.out.println("GROSS PAY:"+gross);
       System.out.println("NET SALARY:"+netSalary);
       System.out.println("ANNUAL SALARY:"+AnnualSal);
    }
    public static void main(String args[])
    {
        SalaryCalculation obj=new SalaryCalculation("Bitasta", 10000.0, 1000.0);
        obj.SalaryCal();
        obj.display();
    }
}

        
        
    
        
    
    

