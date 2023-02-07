// Scored - 2.5 points
import java.util.Scanner;
class RecursionQ4
{
    int sum(int n)
    {
        if(n>=0 && n<=9)
        {
            return n;
        }
        else
        {
            return sum(n/10)+(n%10);
        }
    }
    public static void main(String args[])
    {
        RecursionQ4 obj=new RecursionQ4();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("The sum of the digits is: "+obj.sum(n));
    }//End of main()
}//End of class