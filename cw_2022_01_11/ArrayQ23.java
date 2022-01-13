import java.util.Scanner;
class ArrayQ23
{
  static Scanner sc=new Scanner(System.in);
  int countDigits(int num)
  {
    int count=0;
    while(num!=0)
    {
      // int dig=num%10;
      count++;
      num=num/10;
    }
    return count;
  }
  int[] numToArray(int num)
  {
    int size=countDigits(num);
    int arr[]=new int[size];
    int index=arr.length-1;
    while(num!=0)
    {
      int dig=num%10;
      arr[index]=dig;
      index--;
      num=num/10;
    }
    return arr;
  }
  void displayDigitsInWords(int num)
  {
    int arr[]=numToArray(num);
    String digits[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    for(int i=0;i<=arr.length-1;i++)
    {
      int dig=arr[i];
      System.out.print(digits[dig]+" ");
    }
    System.out.println();
  }
  public static void main(String args[])
  {
    ArrayQ23 obj=new ArrayQ23();
    System.out.println("Enter a number: ");
    int num=sc.nextInt();
    System.out.println("The number in words is: ");
    obj.displayDigitsInWords(num);
  }//End of main()
}//End of class