import java.util.Scanner;
class Mobius
{
  int mobius(int num)
  {
    if(num==1)
    {
      System.out.println("NO PRIME FACTORS");
      return 1;
    }
    else
    {
      int distinctP=0,f=2,count=0;
      while(num>1)
      {
        if(num%f==0)
        {
          num/=f;
          count++;
          if(count>1)
          {
            System.out.println("DUPLICATE PRIME FACTORS");
            return 0;
          }
          distinctP++;
        }
        else
        {
          f++;
          count=0;
        }
      }
      // We have only distinct prime factors
      System.out.println("NUMBER OF DISTINCT PRIME FACTORS = "+distinctP);
      return (int)Math.pow(-1,distinctP);
    }
  }
  //34   =  2  x  17 
  void primeFactorisation(int num)
  {
    int f=2,count=0;
    System.out.print(num+" = ");
    if(num==1)
    {
      System.out.print(num);
    }
    while(num>1)
    {
      if(num%f==0)
      {
        num/=f;
        count++;
        if(count == 1)
        {
          System.out.print(f+" ");
        }
        else
        {
          System.out.print("x "+f+" ");
        }
      }
      else
      {
        f++;
      }
    }
    System.out.println();
  }
  public static void main(String args[])
  {
    Mobius obj=new Mobius();
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    obj.primeFactorisation(num);
    int m=obj.mobius(num);
    // M(78)  =  -1 
    System.out.printf("M(%d) = %d\n",num,m);
  }//End of main()
}//End of class