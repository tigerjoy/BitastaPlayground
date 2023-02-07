import java.util.Scanner;
class StringQ39
{
  static Scanner sc=new Scanner(System.in);
  int maxLength(String words[])
  {
    int max=words[0].length();
    for(int i=0;i<=words.length-1;i++)
    {
       if(words[i].length()>max)
       {
         max=words[i].length();
       }
    }
    return max;
  }
  void displayWords(String words[],int length)
  {
    String output="";//Empty string
    for(int i=0;i<=words.length-1;i++)
    {
      if(words[i].length()==length)
      {
        output+=words[i]+",";
      }
    }
    if(output.length()!=0)
    {
      System.out.println("Strings of length "+length+" = "+output);
    }
  }
  void driver(String words[])
  {
    int max=maxLength(words);
    for(int i=1;i<=max;i++)
    {
      displayWords(words,i);
    }
  }
  void input(String arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter element "+(i+1)+": ");  
      arr[i]=sc.next();
    }
  }
  public static void main(String args[])
  {
    StringQ39 obj=new StringQ39();
    System.out.println("Enter the number of words: ");
    int size=sc.nextInt();
    sc.nextLine();
    String arr[]=new String[size];
    obj.input(arr);
    obj.driver(arr);
  }// End of main
}// End of class