// Scored - 2.5 points
import java.util.Scanner;
class RecursionQ17
{
    boolean isPrime(int n, int f)
    { 
        if(n%f==0 && n==f)
        {
            return true;
        }
        else if(n%f==0 && n!=f)
        {
            return false;
        }
        else if(n==1)
        {
            return false;
        }
        else
        {
            return isPrime(n,f+1);
        }
    }
    
    public static void main(String args[])
    {
        RecursionQ17 obj=new RecursionQ17();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(obj.isPrime(n,2))
        {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
    }// End of main()
}//End of class