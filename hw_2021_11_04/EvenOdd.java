// Scored - 5 points
import java.util.*;
// OBSERVATION #1
// Name of the class should not contain
// underscores.
public class EvenOdd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int n=sc.nextInt();
        // OBSERVATION #2
        // Improper indentation
        if(n%2==0)
        {
             System.out.print(n+"IS AN EVEN NUMBER");
        }
        else
        {
             System.out.print(n+"IS AN ODD NUMBER");
        }
    }
}
            
        