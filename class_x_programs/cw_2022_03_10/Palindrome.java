import java.util.Scanner;
class Palindrome
{
  String reverse(String str)
  {
    String rev="";//Empty string
    int length=str.length();
    for(int i=length-1;i>=0;i--)
    {
      rev+=str.charAt(i);
    }
    return rev;
  }
  boolean isPalindrome(String str)
  {
    String rev=reverse(str);
    return str.equalsIgnoreCase(rev);
  }
  public static void main(String args[])
  {
    Palindrome obj=new Palindrome();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word=sc.next().toLowerCase();
    if(obj.isPalindrome(word))
    {
      System.out.println(word+" is a palindrome word");
    }
    else
    {
      System.out.println(word+" is not a palindrome word");
    }
  }// End of main()
}// End of class