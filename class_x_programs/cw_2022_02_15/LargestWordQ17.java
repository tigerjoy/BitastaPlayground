import java.util.Scanner;
class LargestWordQ17
{
  String largestWord(String str)
  {
    str=str.trim()+" ";
    int firstSpaceIndex=str.indexOf(" ");
    String largest=str.substring(0,firstSpaceIndex);
    str=str.substring(firstSpaceIndex+1);
    int length=str.length();
    int startIndex=0;
    for(int i=0;i<=length-1;i++)
    {
      if(str.charAt(i)==' ')
      {
        String word=str.substring(startIndex,i);
        startIndex=i+1;
        if(word.length()>largest.length())
        {
          largest=word;
        }
      }
    }
    return largest;
  }
  public static void main(String args[])
  {
    LargestWordQ17 obj=new LargestWordQ17();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String str=sc.nextLine();
    String largest=obj.largestWord(str);
    System.out.println("The largest word is: "+largest);
  }// End of main()
}// End of class