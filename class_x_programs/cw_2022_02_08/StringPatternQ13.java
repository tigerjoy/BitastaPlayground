import java.util.Scanner;
class StringPatternQ13
{
  void displayTriangle(String str)
  {
    int n=str.length();
    for(int row=0;row<=n-1;row++)
    {
      for(int col=0;col<=row;col++)
      {
        System.out.print(str.charAt(col)+" ");
      }
      System.out.println();
    }
  }
  public static void main(String args[])
  {
    StringPatternQ13 obj=new StringPatternQ13();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word=sc.next();
    System.out.println("The triangle pattern");
    obj.displayTriangle(word);
  }//End of main()
}// End of class