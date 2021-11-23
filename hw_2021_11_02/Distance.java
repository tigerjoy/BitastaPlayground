// Scored - 5 points
import java.util.*;
public class Distance
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER VALUE OF x1:");
        double x1=sc.nextDouble();
        System.out.print("ENTER VALUE OF y1:");
        double y1=sc.nextDouble();
        System.out.print("ENTER VALUE OF x2:");
        double x2=sc.nextDouble();
        System.out.print("ENTER VALUE OF y2:");
        double y2=sc.nextDouble();
        double x=x2-x1;
        double y=y2-y1;
        double d=Math.sqrt(x*x+y*y);
        System.out.print("DISTANCE BETWEEN THE TWO POINT IS:"+d);
    }
}
    