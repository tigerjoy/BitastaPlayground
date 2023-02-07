import java.util.Scanner;
class ReverseStringQ9
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
  public static void main(String args[])
  {
    ReverseStringQ9 obj=new ReverseStringQ9();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a word:");
    // Method Chaining
    String word=sc.next().toUpperCase();
    String reverse=obj.reverse(word);
    System.out.println("Original word: "+word);
    System.out.println("Reversed word: "+reverse);
  }//End of main()
}//End of class