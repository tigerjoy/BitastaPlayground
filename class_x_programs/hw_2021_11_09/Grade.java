// Scored - 5 points
import java.util.*;
public class Grade
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p;
        System.out.print("ENTER PERCENTAGE MARKS OF THE STUDENT:");
        p=sc.nextInt();
        if(p>=80)
        System.out.println("DISTINCTION");
        // OBSERVATION #1
        // Typo in the condition.
        else if(p>=60 && p<80)
        System.out.println("FIRST DIVISION");
        else if(p>=45 && p<60)
        System.out.println("SECOND DIVISION");
        else if(p>=40 && p<45)
        System.out.println("PASS");
        else
        System.out.println("FAIL");
    }
}