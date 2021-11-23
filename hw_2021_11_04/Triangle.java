// Scored - 4 points
import java.util.*;
public class Triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE THREE SIDES OF THE TRIANGLE:");
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        // OBSERVATION #1
        // Wrong condition.
        // Badly indented code.
        if((a+b>c)&&(b+c>a)&&(a+c>b))
        {
            if(a==b && b==c && c==a)
            {
                System.out.println("EQUILATERAL TRIANGLE");
            }
            else if(a==b||b==c||c==a)
            {
              System.out.println("ISOSCELES TRIANGLE");
            }
            else
            {
                  System.out.println("SCALENE TRIANGLE");
            }
        }
        else
        {
              System.out.println("TRIANGLE NOT POSSIBLE");
        }
    }
}