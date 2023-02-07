// Scored 2.5 points
import java.util.Scanner;
public class RecursionQ6
{
   void displayDigits(int num)
   {
       if(num>=0 && num<=9)
       {
           System.out.println(num);
           return;
       }
       else
       {
           System.out.println(num%10);
           displayDigits(num/10);
       }
   }
   public static void main(String args[])
   {
       RecursionQ6 obj=new RecursionQ6();
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a number: ");
       int num=sc.nextInt();
       System.out.println("The digits of the number are: ");
       obj.displayDigits(num);
   }//End of main()
}//End of class
        