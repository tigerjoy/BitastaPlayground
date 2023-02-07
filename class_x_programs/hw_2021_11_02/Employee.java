// Scored - 5 points
import java.util.*;
public class Employee
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER BASIC PAY:");
        double basic=sc.nextDouble();
        double da=25.0/100*basic;
        double hra=15.0/100.0*basic;
        double pf=8.33/100.0*basic;
        double np= basic+da+hra;
        double gp= np-pf;
        System.out.print("GROSS PAY OF THE ARTICLE IS:"+gp);
    }
}
        
    