// Scored - 5 points
import java.util.*;
public class Area_Perimeter_Diagonal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER SIDE OF A SQUARE:");
        double s=sc.nextDouble();
        System.out.print("ENTER LENGTH OF A RECTANGLE:");
        double l=sc.nextDouble();
        System.out.print("ENTER BREADTH OF A RECTANGLE:");
        double b=sc.nextDouble();
        System.out.println("SQAURE");
        double a1=s*s;
        System.out.println("AREA:"+a1);
        double p1=4*s;
        System.out.println("PERIMETER:"+p1);
        double d1=s*Math.sqrt(2);
        System.out.println("DIAGONAL:"+d1);
        System.out.println("RECTANGLE");
        double a2=l*b;
        System.out.println("AREA:"+a2);
        double p2=2*(l+b);
        System.out.println("PERIMETER:"+p2);
        double d2=Math.sqrt(l*l+b*b);
        System.out.println("DIAGONAL:"+d2);
    }
}
        