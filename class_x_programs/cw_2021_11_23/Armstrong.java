import java.util.*;
class Armstrong
{
  int countDigits(int num)
  {
    int count=0;
    while(num>0)
    {
      count++;
      num=num/10;
    }
    return count;
  }
  boolean isArmstrong(int num)
  {
    // this = obj
    int n=countDigits(num);
    int sum=0, temp=num;
    while(num>0)
    {
      int dig=num%10;
      sum=sum+(int)Math.pow(dig,n);
      num/=10;
    }
    if(temp==sum)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    Armstrong obj=new Armstrong();
    if(obj.isArmstrong(num)==true)
    {
      System.out.println("It is an armstrong number");
    }
    else{
      System.out.println("It is not an armstrong number");
    }
  }
}