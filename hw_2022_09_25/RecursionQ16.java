// Scored - 2.5 points
import java.util.Scanner;
class RecursionQ16
{
    int hcf(int divisor, int dividend)
    {
        if(dividend==0)
        {
            return divisor;
        }
        else if(divisor==0)
        {
            return dividend;
        }
        else
        {
            return hcf(dividend%divisor,divisor);
        }
    }
    public static void main(String args[])
    {
        RecursionQ16 obj=new RecursionQ16();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int hcf=obj.hcf(n1,n2);
        System.out.println("HCF of the numbers is: "+hcf);
    }// End of main()
}//End of class