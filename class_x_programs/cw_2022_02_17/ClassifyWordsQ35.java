import java.util.Scanner;
class ClassifyWordsQ35
{
  String reverse(String str)
  {
    String rev="";// Empty String
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
    if(str.equals(rev))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  boolean isSpecial(String str)
  {
    return str.charAt(0)==str.charAt(str.length()-1);  
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    ClassifyWordsQ35 obj=new ClassifyWordsQ35();
    System.out.print("Enter a word: ");
    String word=sc.next();
    if(obj.isPalindrome(word))
    {
      System.out.println("The word is a palindrome");
    }
    else if(obj.isSpecial(word))
    {
      System.out.println("The word is a special word");
    }
    else
    {
      System.out.println("It is a normal word");
    }
  }// End of main()
}// End of class