// Scored 2.5 points
import java.util.Scanner;
public class Iter2RecursionQ6
{
   void displayDigits(int num)
   {
       if(num==0)
       {
           System.out.println();
       }
       else
       {
           int dig=num%10;
           System.out.print(dig+", ");
           num/=10;
           displayDigits(num);
       }
   }
   public static void main(String args[])
   {
       Iter2RecursionQ6 obj=new Iter2RecursionQ6();
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a number: ");
       int num=sc.nextInt();
       System.out.println("The digits of the number are: ");
       obj.displayDigits(num);
   }//End of main()
}//End of class
        