import java.util.Scanner;
class DoubleLetterQ41
{
   int countDoubleLetter(String str)
  {
    str=str.toUpperCase();
    int count=0;
    int length=str.length();
    for(int i=0;i<=length-2;i++)
    {
      char chL=str.charAt(i);
      char chR=str.charAt(i+1);
      if(Character.isLetter(chL) && Character.isLetter(chR)
         && (chL==chR))
      {
        count++;
      }
    }
    return count;
  }
  public static void main(String args[])
  {
    DoubleLetterQ41 obj=new DoubleLetterQ41();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String str=sc.nextLine();
    System.out.println("Number of double letter sequences are: "+obj.countDoubleLetter(str));
  }// End of main()
}// End of class