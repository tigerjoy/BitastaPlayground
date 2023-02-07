import java.util.Scanner;
class RemoveDuplicateQ42
{
  String removeDuplicates(String str)
  {
    String noDuplicate="";//Empty string
    int length=str.length();
    for(int i=0;i<=length-1;i++)
    {
      char ch=str.charAt(i);
      if(noDuplicate.indexOf(ch)==-1)
      {
        noDuplicate+=ch;
      }
    }
    return noDuplicate;
  }
  public static void main(String args[])
  {
    int num = 5;
    RemoveDuplicateQ42 obj1 = num;
    RemoveDuplicateQ42 obj=new RemoveDuplicateQ42();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word=sc.next();
    System.out.println("Original word: "+word);
    System.out.println("Word after removing duplicates: "+obj.removeDuplicates(word));
  }// End of main()
}// End of class