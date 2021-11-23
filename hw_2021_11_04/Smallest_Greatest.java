// Scored - 4 points
import java.util.*;
// OBSERVATION #1
// Name of the class should not contain
// underscores.
public class Smallest_Greatest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER:");
        int a=sc.nextInt();
        System.out.print("ENTER SECOND NUMBER:");
        int b=sc.nextInt();
        System.out.print("ENTER THIRD NUMBER:");
        int c=sc.nextInt();
        // OBSERVATION #2
        // Does this program work for inputs
        // a = 3, b = 3, c = 2?
        // Moreover, the code can be further 
        // shortened.
        // 3>3 && 3>2
        // false && true -> false
        // if(a>=b && a>=c)
        // {
        //     System.out.println(a+"IS THE GREATEST");
        //     {
        //         if(b<c)
        //         {
        //             System.out.println(b+"IS THE SMALLEST");
        //         }
        //         else
        //         {
        //             System.out.println(c+"IS THE SMALLEST");
        //         }
        //     }
        // }
        // else if(b>=a && b>=c)
        // {
        //     System.out.println(b+"IS THE GREATEST");
        //     {
        //         if(a<c)
        //         {
        //             System.out.println(a+"IS THE SMALLEST");
        //         }
        //         else
        //         {
        //             System.out.println(c+"IS THE SMALLEST");
        //         }
        //     }
        // }
        // else
        // {
        //     System.out.println(c+"IS THE GREATEST");
        //     {
        //         if(a<b)
        //         {
        //             System.out.println(a+"IS THE SMALLEST");
        //         }
        //         else
        //         {
        //             System.out.println(b+"IS THE SMALLEST");
        //         }
        //     }
        // }

        // if-else if (Greatest Number)
        if(a>=b && a >= c){
          System.out.println(a + " is greatest.");
        }
        else if(b>=a && b>=c){
          System.out.println(b + " is greatest.");
        } else {
          System.out.println(c + " is greatest.");
        }
        
        // if-else if (Smallest Number)
        if(a <= b && a <= c){
          System.out.println(a + " is smallest.");
        }
        else if(b<=a && b<=c){
          System.out.println(b + " is smallest.");
        } else {
          System.out.println(c + " is smallest.");
        }
    }
}
            
                    
            
        
    