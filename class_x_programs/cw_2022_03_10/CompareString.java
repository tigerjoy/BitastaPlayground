import java.util.Scanner;
class CompareString
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first sentence: ");
    String str1=sc.nextLine().toUpperCase();
    System.out.println("Enter the second sentence: ");
    String str2=sc.nextLine().toUpperCase();
    if(str1.equals(str2))
    {
      System.out.println("The strings are equal");
    }
    else if(str1.length()>str2.length())
    {
      System.out.println("The largest string is: "+str1);
    }
    else if(str1.length()<str2.length())
    {
      System.out.println("The largest string is: "+str2);
    }
    else
    {
      System.out.println("The strings are of equal length");
    }
  }// End of main()
}// End of class