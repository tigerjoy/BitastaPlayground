import java.util.Scanner;
class CountingSort32A
{
  String countSort(String str)
  {
    str=str.toLowerCase();
    int count[]=new int[26];
    //1.calculate the frequency
    int length=str.length();
    for(int i=0;i<=length-1;i++)
    {
      char ch=str.charAt(i);
      int index=(int)(ch)-97;
      count[index]++;
    }
    //2.construct the sorted String
    String sorted="";// Empty String
    for(int i=count.length-1;i>=0;i--)
    {
      char ch=(char)(i+97);
      for(int j=0;j<=count[i]-1;j++)
      {
        sorted=sorted+ch;
      }
    }
    return sorted;
  }
  public static void main(String args[])
  {
    CountingSort32A obj=new CountingSort32A();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word=sc.next();
    System.out.println("Before sorting: "+word);
    System.out.println("After sorting: "+obj.countSort(word));
  }// End of main()
}// End of class