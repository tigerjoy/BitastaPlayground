import java.util.Scanner;
class StringQ1
{
  void displayChar(String str)
  {
    int length=str.length();
    for(int i=0;i<=length-1;i++)
    {
      System.out.print(str.charAt(i)+", ");
    }
    System.out.println();
  }
  public static void main(String args[])
  {
    StringQ1 obj=new StringQ1();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = sc.next();
    System.out.println("The individual characters of the word are:");
    obj.displayChar(word);
  }// End of main()
}// End of class