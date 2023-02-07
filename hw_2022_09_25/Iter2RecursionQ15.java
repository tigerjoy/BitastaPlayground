// Scored - 2.5 points
import java.util.Scanner;
class Iter2RecursionQ15
{
    int sumOfFactors(int n, int f, int sum)
    {
        if(n==1)
        {
            return sum;
        }
        else
        {
            if(n%f==0)
            {
                sum+=f;
                n/=f;
            }
            else
            {
                f++;
            }
            return sumOfFactors(n,f,sum);
        }
    }
    public static void main(String args[])
    {
        Iter2RecursionQ15 obj=new Iter2RecursionQ15();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int sum=obj.sumOfFactors(n,2,0);
        System.out.println("Sum of the prime factors of the number: "+sum);
    }// End of main()
}//End of class