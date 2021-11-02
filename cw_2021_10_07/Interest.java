import java.util.*;
public class Interest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // double p,r,t;
        // double si=0.0, ci=0.0, a=0.0, m=0.0, d=0.0;
        System.out.print("ENTER PRINCIPAL AMOUNT:");
        double p=sc.nextDouble();
        System.out.print("ENTER RATE OF INTEREST:");
        double r=sc.nextDouble();
        System.out.print("ENTER TIME:");
        double t=sc.nextDouble();
        double si= (p*r*t)/100.0;
        double a= p*Math.pow((1+(r/100.0)),t);
        
        double ci= a-p;
        double d= ci-si;
        System.out.print("DIFFERENCE BETWEEN CI AND SI IS:"+d);
    }
}