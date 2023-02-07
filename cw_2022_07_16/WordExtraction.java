import java.util.Scanner;
class WordExtraction
{
  void displayWords(String str)
  {
    str = str.trim() + " ";
    int startIndex = 0;
    int length = str.length();
    for(int i = 0; i <= length - 1; i++)
    {
      if(str.charAt(i) == ' ')
      {
        String word = str.substring(startIndex, i);
        // Search for the index where
        // we find the first non-space
        // character
        for(;i <= length - 1; i++)
        {
          if(str.charAt(i) != ' '){
            startIndex = i;
            break;
          }
        }
        System.out.println(word);
      }
    }
  }
  String cleanString(String str)
  {
    String cleanStr="";//Empty string
    str = str.trim() + " ";
    int startIndex = 0;
    int length = str.length();
    for(int i = 0; i <= length - 1; i++)
    {
      if(str.charAt(i) == ' ')
      {
        String word = str.substring(startIndex, i);
        cleanStr+=word+" ";
        // Search for the index where
        // we find the first non-space
        // character
        for(;i <= length - 1; i++)
        {
          if(str.charAt(i) != ' '){
            startIndex = i;
            break;
          }
        }
      }
    }
    return cleanStr.trim();
  }
  public static void main(String args[])
  {
    WordExtraction obj = new WordExtraction();
    String str = "COMPUTER IS FUN";
    obj.displayWords(str);
  }
}