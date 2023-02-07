// Scored - 2.5 points
import java.util.Scanner;
class RecursionQ15
{
    int sumOfFactors(int n, int f)
    {
        if(n==1)
        {
            return 0;
        }
        else if(n%f==0)
        {
            return f+sumOfFactors(n/f,f);
        }
        else
        {
            return sumOfFactors(n,f+1);
        }
    }
    public static void main(String args[])
    {
        RecursionQ15 obj=new RecursionQ15();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int sum=obj.sumOfFactors(n,2);
        System.out.println("Sum of the prime factors of the number: "+sum);
    }// End of main()
}//End of class