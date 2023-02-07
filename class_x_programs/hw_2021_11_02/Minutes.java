// Scored - 5 points
import java.util.*;
public class Minutes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUMBER OF MINUTES:");
        int min=sc.nextInt();
        int d=min/1440;
        int r=min%1440;
        int h=r/60;
        int m=r%60;
        System.out.println(d+"DAYS");
        System.out.println(h+"HOURS");
        System.out.println(m+"MINUTES");
    }
}