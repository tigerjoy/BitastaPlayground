// Scored - 4 points
import java.util.Scanner;
class EmirpCorrection
{
    int n,rev,f,count;
    EmirpCorrection(int nn)
    {
        n=nn;
        rev=0;
        f=2;
        count=0;
    }
    // Instead of using iterative to
    // recursive, one can also use the
    // traditional recursive isPrime()
    // as well
    int isPrime(int x)
    {
        if(f>x)
        {
            if(count==1)
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
            if(x%f==0)
            {
                count++;
            }
            f++;
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
        f = 2;
        count = 0;
        int isPrimeN = isPrime(n);
        // System.out.println("n = " + n);
        // System.out.println("isPrimeN = " + isPrimeN);
        f = 2;
        count = 0;
        // System.out.println("rev = " + rev);
        int isPrimeRev = isPrime(rev);
        // System.out.println("isPrimeRev = " + isPrimeRev);
        // if(isPrime(n)==1 && isPrime(rev)==1)
        if(isPrimeN==1 && isPrimeRev==1)
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
        EmirpCorrection obj=new EmirpCorrection(num);
        obj.isEmirp();
    }//End of main()
}//End of class
        