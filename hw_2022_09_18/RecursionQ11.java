// Scored - 1.5 points
import java.util.Scanner;
class RecursionQ11
{
    int sumOfFactors(int n,int f)
    {
        if(f>n)
        {
            return 0;
        }
        else if(n%f==0)
        {
            return f+sumOfFactors(n,f+1);
        }
        else
        {
            return sumOfFactors(n,f+1);
        }
    }
    // No output is displayed
    public static void main(String args[])
    {
        RecursionQ11 obj=new RecursionQ11();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        // Correction
        System.out.println("The sum of the factors are: " + 
            obj.sumOfFactors(num,1));
        // obj.sumOfFactors(num,1);
    }//End of main()
}//End of class
