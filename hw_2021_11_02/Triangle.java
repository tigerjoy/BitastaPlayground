// Scored - 5 points
import java.util.*;
public class Triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER BASE OF THE TRIANGLE:");
        double b=sc.nextDouble();
        System.out.print("ENTER HEIGHT OF THE TRIANGLE:");
        double l=sc.nextDouble();
        double h=Math.sqrt(b*b+l*l);
        double a=1.0/2.0*l*b;
        double p=l+b+h;
        System.out.print("HYPOTENUSE:"+h);
        System.out.print("AREA:"+a);
        System.out.print("PERIMETER:"+p);
    }
}