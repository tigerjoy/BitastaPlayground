import java.util.Scanner;
class NumberToWordsQ43
{
  void numToWords(int num)
  {
    String unit[]={"Zero","One","Two","Three","Four",
                   "Five","Six","Seven","Eight","Nine"};
    String teen[]={"Eleven","Twelve","Thirteen","Fourteen",
                   "Fifteen","Sixteen","Seventeen","Eighteen",
                   "Nineteen"};
    String ten[]={"Ten","Twenty","Thirty","Forty","Fifty",
                  "Sixty","Seventy","Eighty","Ninety"};
    boolean handleZero = true;
    // Thousand's Place Digit
    if(num>=1000 && num<=9999)
    {
      int dig=num/1000;
      System.out.print(unit[dig]+" Thousand ");
      num=num%1000;
      handleZero = false;
    }
    // Hundred's Place Digit
    if(num>=100 && num<=999)
    {
      int dig=num/100;
      System.out.print(unit[dig]+" Hundred ");
      num=num%100;
      handleZero = false;
    }
    // Ten's Place Digit
    if(num>=10 && num<=99)
    {
      if(num>=11 && num<=19)
      {
        System.out.println(teen[num-11]);
        num = 0;
      }
      else
      {
        System.out.print(ten[(num/10)-1]+" ");
        num = num % 10;
      }
      handleZero = false;
    }
    // Unit's Place Digit
    if(num >= 0 && num <= 9)
    {
      if(num == 0 && handleZero == true){
        System.out.println("Zero");
      }
      else if(num != 0){
        System.out.println(unit[num]);
      }
    }
  }
  public static void main(String args[])
  {
    NumberToWordsQ43 obj=new NumberToWordsQ43();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number (0-9999): ");
    int num=sc.nextInt();
    if(num>=0 && num<=9999)
    {
      obj.numToWords(num);
    }
    else
    {
      System.out.println("Number is out of range");
    }
  }// End of main()
}// End of class