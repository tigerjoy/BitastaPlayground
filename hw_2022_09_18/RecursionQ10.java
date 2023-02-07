// Scored - 2.5 points
import java.util.Scanner;
public class RecursionQ10
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
    void displayFib(int term,int i)
    {
        if(i>term-1)
        {
            System.out.println();
        }
        else
        {
            System.out.print(fib(i)+",");
            i++;
            displayFib(term,i);
        }
    }
    public static void main(String args[])
    {
        RecursionQ10 obj=new RecursionQ10();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter term: ");
        int term=sc.nextInt();
        System.out.println("Fibonacci series: ");
        obj.displayFib(term,0);
    }//End of main
}//End of class
        