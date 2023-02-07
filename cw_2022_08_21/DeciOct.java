import java.util.Scanner;
class DeciOct
{
  int n; int oct;
  String octal;

  DeciOct() 
  {
    n = 0;
    oct = 0;
    octal = "";
  }

  void getnum(int nn)
  {
    n = nn;
  }

  void deci_oct()
  {
    // Base Case
    if(n == 0)
    {
      oct = Integer.parseInt(octal);
    }
    // Recursive Case
    else
    {
      int dig = n % 8;
      octal = dig + octal;
      n /= 8;
      deci_oct();
    }
  }

  void show()
  {
    System.out.println("n = " + n);
    deci_oct();
    System.out.println("oct = " + oct);
  }

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    DeciOct obj = new DeciOct();
    System.out.print("Enter the value of num: ");
    int num = sc.nextInt();
    obj.getnum(num);
    obj.show();
  } // End of main()
} // End of class