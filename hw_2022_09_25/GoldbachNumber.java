// Scored - 7.5 points
import java.util.Scanner;
class GoldbachNumber
{
    int N;
    GoldbachNumber(int N)
    {
        this.N=N;
    }
    boolean isPrime(int n)
    {
        int f=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                f++;
            }
        }
        return f==2;
    }
    void isGoldbach()
    {
        System.out.print("PRIME PAIRS ARE: ");
        for(int i=1;i<=N;i=i+2)
        {
            if(isPrime(i))
            {
                for(int j=i;j<=N;j=j+2)
                {
                    if(isPrime(j) && i+j==N)
                    {
                        System.out.println(i+","+j);
                    }
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("N = ");
        int num=sc.nextInt();
        if(num>9 && num<50)
        {
            if(num%2==0)
            {
                GoldbachNumber obj=new GoldbachNumber(num);
                obj.isGoldbach();
            }
            else
            {
                System.out.print("INVALID INPUT. NUMBER IS ODD.");
            }
        }
        else
        {
            System.out.print("INVALID INPUT. NUMBER OUT OF RANGE.");
        }
    }//End of main()
}//End of class
    
        
            