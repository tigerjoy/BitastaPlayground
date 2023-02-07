import java.util.Scanner;
class OddNameQ27
{
  boolean isOdd(String str)
  {
    boolean result=true;
    int length=str.length();
    for(int i=0;i<=length-1;i++)
    {
      int ascii=(int)str.charAt(i);
      if(ascii%2==0)
      {
        result=false;
        break;
      }
    }
    return result;
  }
  public static void main(String args[])
  {
    OddNameQ27 obj=new OddNameQ27();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter name: ");
    String name=sc.next();
    if(obj.isOdd(name))
    {
      System.out.println(name+" is an odd name");
    }
    else
    {
      System.out.println(name+" is not an odd name");
    }
  }// End of main()
}// End of class