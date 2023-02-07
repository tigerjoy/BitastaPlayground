import java.util.Scanner;
// TODO: Import the StringTokenizer class
// from the util package
import java.util.StringTokenizer;

class WordExtraction 
{
  // TODO: Complete displayWords() to 
  // display the words present in str
  // Use <space>, <comma>, <exclamation-mark>,
  // <question-mark>, <full-stop> as the delimiters
  void displayWords(String str)
  {
    StringTokenizer strTok = new StringTokenizer(str.trim()," ,!?.");
    while(strTok.hasMoreTokens())
    {
      String word=strTok.nextToken();
      System.out.print(word+", ");
    }
    System.out.println();
  }
  
  // TODO: Complete extractWords() method using
  // StringTokenizer
  String[] extractWords(String str)
  {
    StringTokenizer strTok = new StringTokenizer(str.trim()," ,!?.");
    String words[] = new String[strTok.countTokens()];
    int index=0;
    while(strTok.hasMoreTokens())
    {
      words[index]=strTok.nextToken();
      index++;
    }  
    return words;
  }
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    WordExtraction obj = new WordExtraction();
    System.out.println("Enter a sentence: ");
    String str = sc.nextLine();

    System.out.println("The words are");
    obj.displayWords(str);

    String words[] = obj.extractWords(str);
    System.out.println("The extracted words are");
    // TODO: Use for-each loop to display the
    // extracted words
    for(String word: words)
    {
       System.out.print(word+", "); 
    }
    System.out.println();
  }
}