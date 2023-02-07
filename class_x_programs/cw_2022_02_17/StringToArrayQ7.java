import java.util.Scanner;
class StringToArrayQ7
{
  void display(String arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print(arr[i]+", ");
    }
    System.out.println();
  }
  int countWords(String str)
  {
    int count=0;
    int length=str.length();
    for(int i=0;i<=length-1;i++)
    {
      if(str.charAt(i)==' ')
      {
        count++;
      }
    }
    return count+1;
  }
  // TOOL
  String[] extractWords(String str)
  {
    String words[]=new String[countWords(str)];
    int index=0;
    str=str.trim()+" ";
    int length=str.length();
    int startIndex=0;
    for(int i=0;i<=length-1;i++)
    {
      if(str.charAt(i)==' ')
      {
        String word=str.substring(startIndex,i);
        startIndex=i+1;
        words[index]=word;
        index++;
      }
    }
    return words;
  }
  public static void main(String args[])
  {
    StringToArrayQ7 obj=new StringToArrayQ7();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String str=sc.nextLine();
    String words[]=obj.extractWords(str);
    System.out.println("The words are: ");
    obj.display(words);
  }// End of main()
}// End of class