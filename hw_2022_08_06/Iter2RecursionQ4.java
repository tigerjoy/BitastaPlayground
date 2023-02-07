// Scored - 0 points
import java.util.Scanner;
class Iter2RecursionQ4
{
    int sum(int num,int sum)
    {
        if(num<=0)
        {
            return sum;
        }
        else
        {
            int dig=num%10;
            sum=sum*dig;
            num/=10;
            return sum(num,sum);
        }
    }
    public static void main(String args[])
    {
        Iter2RecursionQ4 obj=new Iter2RecursionQ4();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("The sum of the digits is: "+obj.sum(n,0));
    }//End of main()
}//End of class