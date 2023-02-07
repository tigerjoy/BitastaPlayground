// Scored - 1 point
import java.util.*;
public class Electricity
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double c=0.0;
        System.out.print("ENTER CUSTOMER'S NAME:");
        String n=sc.nextLine();
        System.out.print("ENTER CUSTOMER'S NUMBER:");
        long num=sc.nextLong();
        System.out.print("ENTER THE UNITS CONSUMED:");
        int u=sc.nextInt();
        if(u<=100)
        {
            c=5.50*u;
        }
        // OBSERVATION #1
        // Wrong conditions
        else if(u>=101 && u<=300)
        {
            c=(100*5.50)+(u-100)*6.50;
        }
        else if(u>=301 && u<=600)
        {
            c=(100*5.50)+(200*6.50)+(u-300)*7.50;
        }
        else if(u>600)
        {
            c=(100*5.50)+(200*6.50)+(u-300)*7.50+(u-600)*8.50;
        }
        System.out.println();
        System.out.println("\t\tMONEY RECEIPT");
        System.out.println("CONSUMER'S NUMBER:"+num);
        System.out.println("CONSUMER'S NAME:"+n);
        System.out.println("UNITS CONSUMED:"+u);
        System.out.println("CHARGE:"+c);
    }
}
            
            
   