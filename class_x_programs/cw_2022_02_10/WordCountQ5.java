import java.util.Scanner;
class WordCountQ5
{
  int countWords(String str)
  {
    // Trim str
    str=str.trim();
    // Count number of spaces
    int spaceCount=0;
    int length=str.length();
    for(int i=0;i<=length-1;i++)
    {
      if(str.charAt(i)==' ')
      {
        spaceCount++;
      }
    }
    // Return number of words
    return spaceCount+1;
  }
  public static void main (String args[])
  {
    WordCountQ5 obj=new WordCountQ5();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String str=sc.nextLine();
    int wordCount=obj.countWords(str);
    System.out.println("It contains "+wordCount+" words");
  }// End of main()
}// End of class