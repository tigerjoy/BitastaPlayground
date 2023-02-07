// Scored - 10 points
import java.util.Scanner;
class Disarium
{
    int num,size;
    Disarium(int nn)
    {
        num=nn;
        size=0;
    }
    void countDigit()
    {
        int n=num;
        while(n>0)
        {
            // Redundant statement
            int dig=n%10;
            size++;
            n/=10;
        }
    }
    int sumOfDigits(int n,int p)
    {
        if(n>=0 && n<=9)
        {
            return n;
        }
        else
        {
            return (int)(Math.pow(n%10,p))+sumOfDigits(n/10,p-1);
        }
    }
    void check()
    {
        if(sumOfDigits(num,size)==num)
        {
            System.out.println("IT IS A DISARIUM NUMBER");
        }
        else
        {
            System.out.println("IT IS NOT A DISARIUM NUMBER");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        Disarium obj=new Disarium(n);
        obj.countDigit();
        obj.check();
    }//End of main()
}//End of class