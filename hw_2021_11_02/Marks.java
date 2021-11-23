// Scored - 5 points
import java.util.*;
public class Marks
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER MARKS OF PHYSICS:");
        double phy=sc.nextDouble();
        System.out.println("ENTER MARKS OF CHEMISTRY:");
        double chem=sc.nextDouble();
        System.out.println("ENTER MARKS OF BIOLOGY:");
        double bio=sc.nextDouble();
        double t=phy+chem+bio;
        double avg=t/3;
        System.out.println("TOTAL MARKS:"+t);
        System.out.println("AVERAGE MARKS:"+avg);
    }
}