import java.util.Scanner;
class ReverseWordByWordQ8
{
  String reverseStoreWords(String str)
  {
    String revWords="";// Empty string
    str=str.trim()+" ";
    int startIndex=0;
    int length=str.length();
    for(int i=0;i<=length-1;i++)
    {
      if(str.charAt(i)==' ')
      {
        String word=str.substring(startIndex,i);
        revWords=word+" "+revWords;
        startIndex=i+1;
      }
    }
    return revWords.trim();
  }
  public static void main(String args[])
  {
    ReverseWordByWordQ8 obj=new ReverseWordByWordQ8();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String str=sc.nextLine();
    System.out.println("The words reversed are: " + obj.reverseStoreWords(str));
  }// End of main()
}// End of class