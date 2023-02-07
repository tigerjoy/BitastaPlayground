// Scored - 5 points
import java.util.*;
// OBSERVATION #1
// Name of the class should not contain
// underscores.
public class Divisible_by_5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int n=sc.nextInt();
        // OBSERVATION #2
        // Improper indentation
        if(n%5==0)
        {
             System.out.print(n+"IS DIVISIBLE BY 5");
            }
        else
        {
             System.out.print(n+"IS NOT DIVISIBLE BY 5");
            }
        }
    }
            