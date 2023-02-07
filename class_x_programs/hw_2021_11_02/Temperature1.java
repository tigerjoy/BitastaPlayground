// Scored - 5 points
import java.util.*;
public class Temperature1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER TERMPERATURE IN CELCIUS DEGREE:");
        double C=sc.nextDouble();
        double F=(C*9.0/5.0)+32;
        System.out.print("ENTER TERMPERATURE IN FAHRENHEIT DEGREE:"+F);
    }
}