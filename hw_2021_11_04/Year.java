// Scored - 5 points
import java.util.*;
public class Year
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE YEAR:");
        int y=sc.nextInt();
        if(y%100==0 && y%400==0)
        {
            System.out.print("LEAP YEAR"); 
        }
        else if(y%100!=0 && y%4==0)
        {
            System.out.print("LEAP YEAR");
        }
        else
        {
            System.out.print("NOT A LEAP YEAR");
        }
    }
}
            
    