// Scored - 7 points
import java.util.Scanner;
class CircularPrime
{
   int N;
   void input()
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("N = ");
       N=sc.nextInt();
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
   boolean findCircularNum(int n)
   {
       int num=0;
       do
       {
           String str=Integer.toString(n);
           char firstDigit=str.charAt(0);
           String remaining=str.substring(1);
           String newNum=remaining+firstDigit;
           num=Integer.parseInt(newNum);
           if(num!=N){
            System.out.println(num);
           }
           if(isPrime(num))
           {
               if(num==N)
               {
                   break;
               }
               // else
               // {
               //     System.out.println(num);
               // }
           }
           else
           {
                System.out.println(N+" IS NOT A CIRCULAR PRIME.");
                return false;
           }
           n=num;
        }
        while(num!=N);
        return true;
   }
   public static void main(String args[])
   {
       CircularPrime obj=new CircularPrime();
       obj.input();
       System.out.println(obj.N);
       if(obj.findCircularNum(obj.N))
       {
           System.out.println(obj.N+" IS A CIRCULAR PRIME.");
       }
   }//End of main
}//End of class