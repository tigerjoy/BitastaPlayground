import java.util.Scanner;
class SmallestWordQ18
{
  String smallestWord(String str)
  {
    str=str.trim()+" ";
    int firstSpaceIndex=str.indexOf(" ");
    String smallest=str.substring(0,firstSpaceIndex);
    str=str.substring(firstSpaceIndex+1);
    int length=str.length();
    int startIndex=0;
    for(int i=0;i<=length-1;i++)
    {
      if(str.charAt(i)==' ')
      {
        String word=str.substring(startIndex,i);
        startIndex=i+1;
        if(word.length()<smallest.length())
        {
          smallest=word;
        }
      }
    }
    return smallest;
  }
  public static void main(String args[])
  {
    SmallestWordQ18 obj=new SmallestWordQ18();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String str=sc.nextLine();
    String smallest=obj.smallestWord(str);
    System.out.println("The smallest word is: "+smallest);
  }// End of main()
}// End of class
