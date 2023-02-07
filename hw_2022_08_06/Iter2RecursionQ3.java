// Scored - 2.5 points
import java.util.Scanner;
class Iter2RecursionQ3
{
    int product(int num,int prod)
    {
        if(num<=0)
        {
            return prod;
        }
        else
        {
            int dig=num%10;
            prod=prod*dig;
            num/=10;
            return product(num,prod);
        }
    }
    public static void main(String args[])
    {
        Iter2RecursionQ3 obj=new Iter2RecursionQ3();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("The product of the digits is: "+obj.product(n,1));
    }//End of main()
}//End of class