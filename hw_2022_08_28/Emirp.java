// Scored - 4 points
import java.util.Scanner;
class Emirp
{
    int n,rev,f,i;
    Emirp(int nn)
    {
        n=nn;
        rev=0;
        f=2;
        i=2;
    }
    // Instead of using iterative to
    // recursive, one can also use the
    // traditional recursive isPrime()
    // as well
    int isPrime(int x)
    {
        if(i>=x)
        {
            if(f==2)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if(x%i==0)
            {
                f++;
            }
            i++;
            return isPrime(x);
        }
    }
    // There is a problem with isEmirp()
    // It classifies 83 to be an emirp number
    // which is wrong as 83 is prime but
    // 38 is not prime
    void isEmirp()
    {
        int num=n;
        while(num>0)
        {
            int dig=num%10;
            rev=(rev*10)+dig;
            num/=10;
        }
        if(isPrime(n)==1 && isPrime(rev)==1)
        {
            System.out.println("IT IS AN EMIRP NUMBER");
        }
        else
        {
            System.out.println("IT IS NOT AN EMIRP NUMBER");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        Emirp obj=new Emirp(num);
        obj.isEmirp();
    }//End of main()
}//End of class
        