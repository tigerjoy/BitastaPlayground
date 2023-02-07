import java.util.Scanner;
class TabularWordQ6A
{
  void displayTabularWords(String str)
  {
    str=str.trim()+" ";
    int startIndex=0;
    int length=str.length();
    // System.out.println("WORD\t\tLENGTH");
    System.out.printf("%-15s %6s\n","WORD","LENGTH");
    for(int i=0;i<=length-1;i++)
    {
      if(str.charAt(i)==' ')
      {
        String word=str.substring(startIndex,i);
        // System.out.println(word+"\t\t"+word.length());
        System.out.printf("%-15s %6d\n",word,word.length());
        startIndex=i+1;
      }
    }
  }
  public static void main(String args[])
  {
    TabularWordQ6A obj=new TabularWordQ6A();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String str=sc.nextLine();
    System.out.println("The words are: ");
    obj.displayTabularWords(str);
  }// End of main()
}// End of class