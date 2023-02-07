// Scored - 2.5 points
import java.util.Scanner;
class Iter2RecursionQ14
{
    void displayPrimeFactors(int n, int f)
    {
        if(n==1)
        {
            return;
        }
        else 
        {
            if(n%f==0)
            {
                System.out.print(f+" x ");
                n/=f;
            }
            else
            {
                f++;
            }
            displayPrimeFactors(n,f);
        }
    }
    public static void main(String args[])
    {
        Iter2RecursionQ14 obj=new Iter2RecursionQ14();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print(n+" = ");
        obj.displayPrimeFactors(n,2);
    }//End of main
}//End of class