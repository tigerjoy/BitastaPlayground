// Scored - 5 points
import java.util.*;
public class BioData
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR NAME:");
        String n=sc.nextLine();
        System.out.print("ENTER YOUR FATHER'S NAME:");
        String f_n=sc.nextLine();
        System.out.print("ENTER YOUR ADDRESS:");
        String a=sc.nextLine();
        System.out.print("ENTER YOUR EMAIL ID:");
        String em=sc.nextLine();
        System.out.print("ENTER YOUR BIRTH DATE:");
        int d=sc.nextInt();
        System.out.print("ENTER YOUR BIRTH MONTH:");
        int m=sc.nextInt();
        System.out.print("ENTER YOUR BIRTH YEAR:");
        int y=sc.nextInt();
        System.out.print("ENTER YOUR PHONE NUMBER:");
        long phno=sc.nextLong();
        
        System.out.println();
        System.out.println("NAME               :      "+n);
        System.out.println("FATHER'S NAME      :      "+f_n);
        System.out.println("DATE OF BIRTH      :      "+d+"."+m+"."+y);
        System.out.println("ADDRESS            :      "+a);
        System.out.println("PHONE NO.          :      "+phno);
        System.out.println("EMAIL ID           :      "+em);
    }
}
    