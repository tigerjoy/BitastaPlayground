// Scored - 2.5 points
import java.util.Scanner;
class RecursionQ1
{
    int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main(String args[])
    {
        RecursionQ1 obj=new RecursionQ1();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("The factorial of the number is: "+obj.fact(n));
    }//End of main()
}//End of class