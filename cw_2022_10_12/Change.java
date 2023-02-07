import java.util.Scanner;
class Change
{
  String str, newStr;
  int len;
  Change()
  {
    str="";//Empty string
    newStr="";//Empty string
    len=0;
  }
  void inputword()
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a word: ");
    str=sc.next();
    len=str.length();
  }
  char caseconvert(char ch)
  {
    if(Character.isUpperCase(ch))
    {
      return Character.toLowerCase(ch);
    }
    else
    {
      return Character.toUpperCase(ch);
    }
  }
  void recchange(int i)
  {
    if(i==len)
    {
      return;
    }
    else
    {
      newStr+=caseconvert(str.charAt(i));
      i++;
      recchange(i);
    }
  }
  void display()
  {
    System.out.println("The original word: "+str);
    System.out.println("The new word: "+newStr); 
  }
  public static void main(String args[])
  {
    Change obj=new Change();
    obj.inputword();
    obj.recchange(0);
    obj.display();
  }//End of main()
}//End of class