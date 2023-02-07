import java.util.Scanner;
class StringQ26
{
  int countWord(String str, String key)
  {
    int count=0;
    str=str.trim()+" ";
    int length=str.length();
    int startIndex=0;
    for(int i=0;i<=length-1;i++)
    {
      if(str.charAt(i)==' ')
      {
        String word=str.substring(startIndex,i);
        startIndex=i+1;
        if(word.equals(key))
        {
          count++;
        }
      }
    }
    return count;
  }
  public static void main(String args[])
  {
    StringQ26 obj=new StringQ26();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String str=sc.nextLine();
    System.out.print("Enter the word to be counted: ");
    String word=sc.next();
    int count=obj.countWord(str,word);
    System.out.println(word+" is present "+count+" times");
  }// End of main()
}// End of class