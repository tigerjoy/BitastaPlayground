import java.util.Scanner;

class RecursiveFunctions {
  int pow(int a, int b) {
    if (b == 0) {
      return 1;
    } else {
      return a * pow(a, b - 1);
    }
  }

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    RecursiveFunctions obj = new RecursiveFunctions();
    System.out.print("Enter base: ");
    int a = sc.nextInt();
    System.out.print("Enter exponent: ");
    int b = sc.nextInt();
    System.out.printf("pow(%d, %d) = %d\n", a, b, obj.pow(a,b));
  }
}