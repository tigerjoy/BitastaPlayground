// Scored - 5 points
import java.util.*;
public class Purchase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER PRICE OF LAPTOP:");
        double l=sc.nextDouble();
        System.out.print("ENTER PRICE OF PRINTER:");
        double p=sc.nextDouble();
        double l1=l-(15.0/100.0*l);
        double p1=p-(10.0/100.0*p);
        double t=l1+p1;
        System.out.print("TOTAL AMOUNT:"+t);
    }
}