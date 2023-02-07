// Scored 2.5 points
import java.util.Scanner;
public class RecursionQ8
{
    int reverse(int n)
    {
        if(n>=0 && n<=9)
        {
            return n;
        }
        else
        {
            int x=Integer.toString(n).length()-1;
            return (n%10)*(int)(Math.pow(10,x))+reverse(n/10);
        }
    }
    public static void main(String args[])
    {
        RecursionQ8 obj=new RecursionQ8();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("The reversed number is: "+obj.reverse(n));
    }//End of main()
}//End of class
    