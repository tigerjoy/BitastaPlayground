import java.util.Scanner;
class DecimalToRomanQ44
{
  String decToRoman(int num)
  {
    String symbol[] = {"I","IV","V","IX","X",
                       "XL","L","XC","C","CD",
                       "D","CM","M"};
    int value[] = {1,4,5,9,10,
                   40,50,90,100,400,
                   500,900,1000};
    String roman="";//Empty string
    for(int i=value.length-1;i>=0;i--)
    {
      int quotient=num/value[i];
      int remainder=num%value[i];
      for(int j=1;j<=quotient;j++)
      {
        roman+=symbol[i]; 
      }
      num=remainder;
    }
    return roman;
  }
  public static void main(String args[])
  {
    DecimalToRomanQ44 obj=new DecimalToRomanQ44();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number(1-3999): ");
    int num=sc.nextInt();
    if(num>=1 && num<=3999)
    {
      // 12 = XII
      System.out.println(num+" = "+obj.decToRoman(num));
    }
    else
    {
      System.out.println("Number is not within range");
    }
  }// End of main()
}// End of class
