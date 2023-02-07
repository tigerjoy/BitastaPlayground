// Scored - 2.5 points
import java.util.Scanner;
class RecursionQ3
{
    int product(int n)
    {
        if(n>=0 && n<=9)
        {
            return n;
        }
        else
        {
            return product(n/10)*(n%10);
        }
    }
    public static void main(String args[])
    {
        RecursionQ3 obj=new RecursionQ3();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("The product of the digits is: "+obj.product(n));
    }//End of main()
}//End of class