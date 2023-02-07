import java.util.Scanner;
class WordExtractionQ6
{
  void displayWords(String str)
  {
    str=str.trim()+" ";
    int startIndex=0;
    int length=str.length();
    for(int i=0;i<=length-1;i++)
    {
      if(str.charAt(i)==' ')
      {
        String word=str.substring(startIndex,i);
        System.out.println(word);
        startIndex=i+1;
      }
    }
  }
  public static void main(String args[])
  {
    WordExtractionQ6 obj=new WordExtractionQ6();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String str=sc.nextLine();
    System.out.println("The words are: ");
    obj.displayWords(str);
  }// End of main()
}// End of class