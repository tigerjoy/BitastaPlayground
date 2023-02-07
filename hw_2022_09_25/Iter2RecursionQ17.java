// Scored - 2 points
import java.util.Scanner;
class Iter2RecursionQ17
{
    boolean isPrime(int n, int f, int i)
    {
        // if(i==n) <--- Mistake
        if (i > n)
        {
            if(f==2)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else 
        {
            if(n%i==0)
            {
                f++;
            }
            i++;
            return isPrime(n,f,i);
        }
    }
    public static void main(String args[])
    {
        Iter2RecursionQ17 obj=new Iter2RecursionQ17();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        // Mistake in passing the value of arguments
        // if(obj.isPrime(n,2,1)) <--- Mistake
        if(obj.isPrime(n,0,1))
        {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
    }// End of main()
}//End of class