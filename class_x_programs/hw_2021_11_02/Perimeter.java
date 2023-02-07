// Scored - 5 points
import java.util.*;
public class Perimeter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE THREE SIDES OF THE TRIANGLE:");
        double s1=sc.nextDouble();
        double s2=sc.nextDouble();
        double s3=sc.nextDouble();
        System.out.println("ENTER THE LENGTH AND BREADTH OF THE RECTANGLE:");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("ENTER THE RADIUS OF THE CIRCLE:");
        double r=sc.nextDouble();
        double p1=s1+s2+s3;
        double p2=2*(l+b);
        double p3=2*Math.PI*r;
        System.out.println("PERIMETER OF THE TRIANGLE:"+p1);
        System.out.println("PERIMETER OF THE RECTANGLE:"+p2);
        System.out.println("PERIMETER OF THE CIRCLE:"+p3);
    }
}