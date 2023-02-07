// Scored - 5 points
import java.util.*;
// OBSERVATION #1
// Name of the class should always begin with
// uppercase letters.
public class grade
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int p;
        System.out.print("ENTER PERCENTAGE MARKS OF THE STUDENT:");
        p=sc.nextInt();
        if(p>90)
        System.out.println("GRADE A");
        else if(p>80 && p<=90)
        System.out.println("GRADE B");
        else if(p>70 && p<=80)
        System.out.println("GRADE C");
        else if(p>60 && p<=70)
        System.out.println("GRADE D");
        else if(p>50 && p<=60)
        System.out.println("GRADE E");
        else
        System.out.println("FAIL");
    }
}