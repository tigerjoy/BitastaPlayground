// Scored - 5 points
import java.util.*;
// OBSERVATION #1
// Name of the class should not contain
// underscores.
public class Week
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.print("ENTER A NUMBER FROM 1 TO 7:");
         int n=sc.nextInt();
         if(n==1)
         {
             System.out.println("SUNDAY");
            }
           else if(n==2)
         {
             System.out.println("MONDAY");
            }
           else if(n==3)
         {
             System.out.println("TUESDAY");
            }
           else if(n==4)
         {
             System.out.println("WEDNESDAY");
            }
           else if(n==5)
         {
             System.out.println("THURSDAY");
            }
           else if(n==6)
         {
             System.out.println("FRIDAY");
            }
           else if(n==7)
         {
             System.out.println("SATURDAY");
            }
            else
         {
             System.out.println("WRONG CHOICE");
            }
        }
    }
