// Scored - 2.5 points
import java.util.Scanner;
class RecursionQ5
{
    int sumNaturalNums(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n+sumNaturalNums(n-1);
        }
    }
    public static void main(String args[])
    {
        RecursionQ5 obj=new RecursionQ5();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("The sum of all natural numbers less than or equal to n: "+obj.sumNaturalNums(n));
    }//End of main()
}//End of class