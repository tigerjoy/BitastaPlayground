import java.util.Scanner;
class BaseConversionQ28
{
  int binToDec(String bin)
  {
    int dec=0;
    int placeValue=(int)Math.pow(2,bin.length()-1);
    int length=bin.length();
    for(int i=0;i<=length-1;i++)
    {
      char ch=bin.charAt(i);
      int dig=(int)(ch-48);
      dec=dec+(dig*placeValue);
      placeValue/=2;
    }
    return dec;
  }
  int octToDec(String oct)
  {
    int dec=0;
    int placeValue=(int)Math.pow(8,oct.length()-1);
    int length=oct.length();
    for(int i=0;i<=length-1;i++)
    {
      char ch=oct.charAt(i);
      int dig=(int)(ch-48);
      dec=dec+(dig*placeValue);
      placeValue/=8;
    }
    return dec;
  }
  int hexToDec(String hex)
  {
    int dec=0;
    int placeValue=(int)Math.pow(16,hex.length()-1);
    int length=hex.length();
    for(int i=0;i<=length-1;i++)
    {
      char ch=hex.charAt(i);
      int dig;
      if(Character.isDigit(ch))
      {
        dig=(int)(ch-48);
      }
      else
      {
        dig=(int)(ch-55);
      }
      dec=dec+(dig*placeValue);
      placeValue/=16;
    }
    return dec;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    BaseConversionQ28 obj=new BaseConversionQ28();
    System.out.println("Press 1 to convert from binary to decimal");
    System.out.println("Press 2 to convert from octal to decimal");
    System.out.println("Press 3 to convert from hexadecimal to decimal");
    System.out.print("Enter your choice (1-3): ");
    int choice=sc.nextInt();
    sc.nextLine();
    switch(choice)
    {
      case 1:
      {
        System.out.print("Enter a binary number: ");
        String bin=sc.next();
        // (1110)2 = (14)10
        System.out.println("("+bin+")2=("+obj.binToDec(bin)+")10");
        break;
      }
      case 2:
      {
        System.out.print("Enter a octal number: ");
        String oct=sc.next();
        // (73)8 = (59)10
        System.out.println("("+oct+")8=("+obj.octToDec(oct)+")10");
        break;
      }
      case 3:
      {
        System.out.print("Enter a hexadecimal number: ");
        String hex=sc.next();
        // (7D5)16 = (2005)10
        System.out.println("("+hex+")16=("+obj.hexToDec(hex)+")10");
        break;
      }
      default:
      {
        System.out.println("Invalid choice!");
      }
    }
  }// End of main()
}// End of class