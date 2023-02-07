// Scored 2.5 points
import java.util.Scanner;
public class RecursionQ9
{
    int fib(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            return fib(n-2)+fib(n-1);
        }
    }
    public static void main(String args[])
    {
        RecursionQ9 obj=new RecursionQ9();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter nth term: ");
        int n=sc.nextInt();
        System.out.println("The "+n+"th fibonacci term is: "+obj.fib(n));
    }//End of main()
}//End of class
    
    
