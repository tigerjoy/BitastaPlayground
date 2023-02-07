// Scored - 5 points
import java.util.*;
public class Interest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int p,t,r;
        double si=0.0, ci=0.0, a=0.0, m=0.0, d=0.0;
        System.out.print("ENTER PRINCIPAL AMOUNT:");
        p=sc.nextInt();
        System.out.print("ENTER RATE OF INTEREST:");
        r=sc.nextInt();
        System.out.print("ENTER TIME:");
        t=sc.nextInt();
        si= p*r*t/100.0;
        a= p*Math.pow((1+r/100.0),t);
        
        ci= a-p;
        d= ci-si;
        System.out.print("DIFFERENCE BETWEEN CI AND SI IS:"+d);
    }
}