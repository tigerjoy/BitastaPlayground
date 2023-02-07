// Scored - 2.5 points
import java.util.Scanner;
class Iter2RecursionQ16
{
    int hcf(int divisor, int dividend, int remainder)
    {
        if(remainder<=0)
        {
            return divisor;
        }
        else 
        {
            dividend=divisor;
            divisor=remainder;
            remainder=dividend%divisor;
            return hcf(divisor,dividend,remainder);
        }
    }
    public static void main(String args[])
    {
        Iter2RecursionQ16 obj=new Iter2RecursionQ16();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int rem=n2%n1;
        int hcf=obj.hcf(n1,n2,rem);
        System.out.println("HCF of the numbers is: "+hcf);
    }// End of main()
}//End of class