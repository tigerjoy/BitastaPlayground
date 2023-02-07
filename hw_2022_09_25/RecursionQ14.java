// Scored - 2.5 points
import java.util.Scanner;
class RecursionQ14
{
    void displayPrimeFactors(int n, int f)
    {
        if(n==1)
        {
            System.out.println();
        }
        else if(n%f==0)
        {
            System.out.print(f+" x ");
            displayPrimeFactors(n/f,f);
        }
        else
        {
            displayPrimeFactors(n,f+1);
        }
    }
    public static void main(String args[])
    {
        RecursionQ14 obj=new RecursionQ14();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print(n+" = ");
        obj.displayPrimeFactors(n,2);
    }//End of main
}//End of class