import java.util.Scanner;
class StringQ3
{
  int countUpperCase(String str)
  {
    int count=0;
    for(int i=0;i<=str.length()-1;i++)
    {
      char ch=str.charAt(i);
      if(ch>='A'&& ch<='Z')
      {
        count++;
      } 
    }
    return count;
  }
  int countLowerCase(String str)
  {
    int count=0;
    for(int i=0;i<=str.length()-1;i++)
    {
      char ch=str.charAt(i);
      if(ch>='a'&& ch<='z')
      {
        count++;
      } 
    }
    return count;
  }
  int countDigit(String str)
  {
    int count=0;
    for(int i=0;i<=str.length()-1;i++)
    {
      char ch=str.charAt(i);
      if(ch>='0'&& ch<='9')
      {
        count++;
      } 
    }
    return count;
  }
  int countSpecial(String str)
  {
    return str.length()-(countUpperCase(str)+countLowerCase(str)+countDigit(str));
  }
  public static void main(String args[])
  {
    StringQ3 obj=new StringQ3();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a sentence:");
    String str=sc.nextLine();
    System.out.println("The no. of upper case letters are: "+obj.countUpperCase(str));
    System.out.println("The no. of lower case letters are: "+obj.countLowerCase(str));
    System.out.println("The no. of digits are: "+obj.countDigit(str));
    System.out.println("The no. of special characters are: "+obj.countSpecial(str));
  }// End of main()
}// End of class