import java.util.Scanner;
class StringFrequencyQ22
{
  int countItems(String str, boolean isCounted[], char key)
  {
    int count=0;
    int length=str.length();
    for(int i=0;i<=length-1;i++)
    {
      if (key==str.charAt(i))
      {
        count++;
        isCounted[i]=true;
      }
    }
    return count;
  }
  void displayFrequency(String str)
  {
    str=str.toUpperCase();
    boolean isCounted[]=new boolean[str.length()];
    System.out.println("CHARACTER\tFREQUENCY");
    int length=str.length();
    for(int i=0;i<=length-1;i++)
    {
      // If the ith character has not been counted
      if(isCounted[i]==false)
      {
        int count=countItems(str,isCounted,str.charAt(i));
        System.out.println(str.charAt(i)+"\t\t\t\t\t"+count);
      }
    }
  }
  public static void main(String args[])
  {
    StringFrequencyQ22 obj=new StringFrequencyQ22();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word=sc.next();
    System.out.println("The frequency of the characters of the word are:");
    obj.displayFrequency(word);
  }// End of main()
}// End of class