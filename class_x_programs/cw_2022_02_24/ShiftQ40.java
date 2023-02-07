import java.util.Scanner;
class ShiftQ40
{
  String shiftBy1(String str)
  {
    str=str.toUpperCase();
    String modified="";//Empty string
    int length=str.length();
    for(int i=0;i<=length-1;i++)
    {
      char ch=str.charAt(i);
      if(Character.isLetter(ch))
      {
        int value=(int)(ch)-65;
        value=(value+1)%26;
        ch=(char)(value+65);
      }
      modified+=ch;
    }
    return modified;
  }
  public static void main(String args[])
  {
    ShiftQ40 obj=new ShiftQ40();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String str=sc.nextLine();
    System.out.println("Original sentence: "+str);
    System.out.println("Modified sentence: "+obj.shiftBy1(str));
  }// End of main()
}// End of class