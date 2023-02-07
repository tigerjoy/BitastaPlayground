import java.util.Scanner;
class PalindromeStringQ10
{
  String reverse(String str)
  {
    String rev="";//Empty String
    int length=str.length();
    for(int i=length-1;i>=0;i--)
    {
      char ch=str.charAt(i);
      rev+=ch;
    }
    return rev;
  }
  boolean isPalindrome(String str)
  {
    String rev=reverse(str);
    if(str.equalsIgnoreCase(rev))
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
    PalindromeStringQ10 obj=new PalindromeStringQ10();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a word: ");
    String word=sc.next();
    if(obj.isPalindrome(word))
    {
      System.out.println(word+" is a palindrome");
    }
    else
    {
      System.out.println(word+" is not a palindrome");
    }
  }// End of main()
}// End of class