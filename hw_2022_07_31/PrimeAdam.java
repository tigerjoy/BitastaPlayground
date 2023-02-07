// Scored - 7.5 points
import java.util.Scanner;
class PrimeAdam
{
    int m,n;
    PrimeAdam(int m,int n)
    {
        this.m=m;
        this.n=n;
    }
    boolean isPrime(int num)
    {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        return count==2;
    }
    int reverse(int num)
    {
        int rev=0;
        while(num>0)
        {
            int dig=num%10;
            rev=(rev*10)+dig;
            num/=10;
        }
        return rev;
    }
    boolean isAdam(int num)
    {
        int sq=num*num;
        int rev=reverse(num);
        int revSq=rev*rev;
        return sq==reverse(revSq) && revSq==reverse(sq);
    }
    // isPrimeAdam() can be converted to a 
    // single line method
    boolean isPrimeAdam(int num)
    {  
      return isPrime(num) && isAdam(num);
        // if(isPrime(num)==true && isAdam(num)==true)
        // {
        //     return true;
        // }
        // else
        // {
        //     return false;
        // }
    }
    void display()
    {
        int count=0;
        System.out.println("THE PRIME-ADAM INTEGERS ARE:");
        for(int i=m;i<=n;i++)
        {
            if(isPrimeAdam(i))
            {
                count++;
                System.out.print(i+"\t");
            }
        }
        // Try with m = 50 and 70
        // Check the output and compare with
        // question paper
        if(count==0)
        {
          // OLD CODE
            // System.out.println("NIL");
          // NEW CODE
            System.out.print("NIL");
        }
        System.out.println();
        System.out.println("FREQUENCY OF THE PRIME-ADAM INTEGERS IS: "+count);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("m = ");
        int a=sc.nextInt();
        System.out.print("n = ");
        int b=sc.nextInt();
        if(a<b)
        {
            PrimeAdam obj=new PrimeAdam(a,b);
            obj.display();
        }
        // Wasn't there a full stop at the end
        // in the question paper?
        else
        {
            System.out.println("INVALID INPUT");
        }
    }//End of main
}//End of class

                
    