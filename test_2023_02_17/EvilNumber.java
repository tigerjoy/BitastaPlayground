// Scored - 14/14 points
import java.util.Scanner;
class EvilNumber
{
    int M,N;
    EvilNumber(int M, int N)//Parameterised constructor
    {
        this.M=M;
        this.N=N;
    }
    String dec2bin(int num)//to convert num to its binary equivalent
    {
        String bin="";//Empty string
        while(num>0)
        {
            int dig=num%2;
            bin=dig+""+bin;
            num/=2;
        }
        return bin;
    }
    boolean isEvil(int num)//to check if num is evil
    {
        String bin=dec2bin(num);
        int count=0;
        for(int i=0;i<=bin.length()-1;i++)
        {
            if(bin.charAt(i)=='1')
            {
                count++;
            }
        }
        return count%2==0;
    }
    void displayEvil()//to display the evil numbers and frequency
    {
        int count=0;
        for(int i=M;i<=N;i++)
        {
            if(isEvil(i))
            {
                count++;
                System.out.print(i+",");
            }
        }
        System.out.println("\nFREQUENCY OF EVIL NUMBERS IS: "+count);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("M = ");
        int m=sc.nextInt();
        System.out.print("N = ");
        int n=sc.nextInt();
        if(m<=n && m>2 && n<1000)
        {
            EvilNumber obj=new EvilNumber(m,n);
            System.out.println("THE EVIL NUMBERS ARE: ");
            obj.displayEvil();
        }
        else
        {
            System.out.println("INVALID VALUES OF M AND N");
        }
    }//End of main
}//End of class
