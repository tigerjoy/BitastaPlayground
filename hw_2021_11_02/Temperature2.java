// Scored - 5 points
import java.util.*;
public class Temperature2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER TERMPERATURE IN FAHRENHEIT DEGREE:");
        double F=sc.nextDouble();
        double C=5.0/9.0*(F-32);
        System.out.print("ENTER TERMPERATURE IN CELCIUS DEGREE:"+C);
    }
}
