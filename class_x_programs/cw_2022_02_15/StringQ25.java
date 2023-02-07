import java.util.Scanner;
class StringQ25
{
  String toPigLatin(String word)
  {
    word=word.toUpperCase();
    int pos=-1;
    int length=word.length();
    for(int i=0;i<=length-1;i++)
    {
      char ch=word.charAt(i);
      if("aeiouAEIOU".indexOf(ch)!=-1)
      {
        pos=i;
        break;
      }
    }
    String part1=word.substring(0,pos);
    String part2=word.substring(pos);
    String output=part2+part1+"AY";
    return output;
  } 
  void displayWordsInPiglatin(String str)
  {
    str=str.trim()+" ";
    int length=str.length();
    int startIndex=0;
    for(int i=0;i<=length-1;i++)
    {
      if(str.charAt(i)==' ')
      {
        String word=str.substring(startIndex,i);
        startIndex=i+1;
        String pigLatin=toPigLatin(word);
        System.out.print(pigLatin+" ");
      }
    }
  }
  public static void main(String args[])
  {
    StringQ25 obj=new StringQ25();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String str=sc.nextLine();
    System.out.println("All the words of the sentence in piglatin: ");
    obj.displayWordsInPiglatin(str);
  }// End of main()
}// End of class