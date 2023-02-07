import java.util.*;
public class Grade
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER PERCENTAGE MARKS OF THE STUDENT:");
        double p=sc.nextDouble();
        if(p>=80)
        {
          System.out.println("GRADE A");
        }
        else if(p>=60 && p<80)
        System.out.println("GRADE B");
        else if(p>=45 && p<60)
        System.out.println("GRADE C");
        else if(p>=40 && p<45)
        System.out.println("GRADE D");
        else
        System.out.println("FAIL");
    }
}