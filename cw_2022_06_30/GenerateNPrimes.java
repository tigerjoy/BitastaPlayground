import java.util.Scanner;
class GenerateNPrimes
{
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
  void displayNPrimes(int N)
  {
    int currNum=1;
    while(N>0)
    {
      if(isPrime(currNum))
      {
        System.out.print(currNum+",");
        N--;
      }
      currNum++;
    }
    System.out.println();
  }
  public static void main(String args[])
  {
    GenerateNPrimes obj=new GenerateNPrimes();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of prime numbers to be" +" generated: ");
    int N=sc.nextInt();
    System.out.println("The prime numbers are: ");
    obj.displayNPrimes(N);
  }//End of main()
}//End of class