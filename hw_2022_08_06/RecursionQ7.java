// Scored - 2.5 points
import java.util.Scanner;
class RecursionQ7
{
    int count(int n)
    {
        if(n>=0 && n<=9)
        {
            return 1;
        }
        else
        {
            return 1+count(n/10);
        }
    }
    public static void main(String args[])
    {
        RecursionQ7 obj=new RecursionQ7();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("The number of the digits is: "+obj.count(n));
    }//End of main()
}//End of class