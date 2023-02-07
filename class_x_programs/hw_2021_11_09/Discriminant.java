// Scored - 5 points
import java.util.*;
public class Discriminant
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER VALUE OF a:");
        double a=sc.nextDouble();
        System.out.print("ENTER VALUE OF b:");
        double b=sc.nextDouble();
        System.out.print("ENTER VALUE OF c:");
        double c=sc.nextDouble();
        double d=b*b-4*a*c;
        if(d>=0)
        {
            System.out.println("ROOTS ARE REAL");
        }
        else
        {
            System.out.println("ROOTS ARE IMAGINARY");
        }
    }
}
        
    