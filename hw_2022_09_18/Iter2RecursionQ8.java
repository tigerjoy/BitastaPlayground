// Scored 2.5 points
import java.util.Scanner;
public class Iter2RecursionQ8
{
    int reverse(int n,int rev)
    {
        if(n==0)
        {
            return rev;
        }
        else
        {
            int dig=n%10;
            rev=(rev*10)+dig;
            n/=10;
            return reverse(n,rev);
        }
    }
    public static void main(String args[])
    {
        Iter2RecursionQ8 obj=new Iter2RecursionQ8();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("The reversed number is: "+obj.reverse(n,0));
    }//End of main()
}//End of class
    