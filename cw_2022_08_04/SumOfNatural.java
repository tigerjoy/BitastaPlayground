import java.util.Scanner;
class SumOfNatural
{
  int sumOfNaturalNums(int n)
  {
    // Base Case #1
    if(n < 1)
    {
      return 0;
    }
    // Base Case #2
    else if(n == 1)
    {
      return 1;
    }
    // Recursive Case
    else
    {
      return n + sumOfNaturalNums(n-1);
    }
  }
  int sumOfNaturalNums(int n)
  {
    // Base Case
    if(n == 1)
    {
      return 1;
    }
    // Recursive Case
    else
    {
      return n + sumOfNaturalNums(n-1);
    }
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    SumOfNatural obj = new SumOfNatural();
    System.out.printf("sum(%d) = %d\n", num, obj.sumOfNaturalNums(num));
  }
}