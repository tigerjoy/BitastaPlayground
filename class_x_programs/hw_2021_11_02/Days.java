// Scored - 5 points
import java.util.*;
public class Days
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUMBER OF DAYS:");
        int days=sc.nextInt();
        int y=days/365;
        int r=days%365;
        int m=r/30;
        int d=r%30;
        System.out.println(y+"YEARS");
        System.out.println(m+"MONTHS");
        System.out.println(d+"DAYS");
    }
}
    
