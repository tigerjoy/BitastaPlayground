import java.util.Scanner;
class EvilNumber
{
  int N,count;
  String bin;
  EvilNumber(int N)
  {
    this.N=N;
    count=0;
    bin="";// Empty string
  }
  // Converts N into its binary equivalent
  // and stores it in bin
  void dec2bin()
  {
    int num=N;
    while(num>0)
    {
      int rem=num%2;
      bin=rem+bin;
      num=num/2;
    }
  }
  // Counts the number of ones present in bin
  // and stores it in count
  void countOnes()
  {
    int length=bin.length();
    for(int i=0;i<=length-1;i++)
    {
      if(bin.charAt(i)=='1')
      {
        count++;
      }
    }
  }
  // Displays if the number is evil number or not
  void display()
  {
    System.out.println("BINARY EQUIVALENT: "+bin);
    System.out.println("NUMBER OF 1’s: "+count);
    if(count%2==0)
    {
      System.out.println("EVIL NUMBER");
    }
    else
    {
      System.out.println("NOT AN EVIL NUMBER");
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("N = ");
    int num=sc.nextInt();
    if(num>2 && num<100)
    {
      EvilNumber obj=new EvilNumber(num);
      obj.dec2bin();
      obj.countOnes();
      obj.display();
    }
    else
    {
      System.out.println("NUMBER OUT OF RANGE");
    }
  }//End of main()
}//End of class