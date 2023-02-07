import java.util.Scanner;
class PigLatinQ24
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
  public static void main(String args[])
  {
    PigLatinQ24 obj=new PigLatinQ24();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word=sc.next();
    String pigLatin=obj.toPigLatin(word);
    System.out.println(word+" in piglatin is "+pigLatin);
  }// End of main()
}// End of class